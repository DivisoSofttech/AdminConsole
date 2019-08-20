package com.diviso.graeshoppe.service.impl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;

import static org.elasticsearch.action.search.SearchType.QUERY_THEN_FETCH;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.service.AggregateQueryService;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.aggregation.AggregatedPage;

import io.searchbox.client.JestClient;
import io.searchbox.core.search.aggregation.TermsAggregation;
import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

@Service
public class AggregateQueryServiceImpl implements AggregateQueryService {
	
	@Autowired
	ElasticsearchOperations elasticsearchOperations;
	
	int i=0; Long count=0L;
	@Autowired
	private JestClient jestClient;
	@Autowired
	private  JestElasticsearchTemplate elasticsearchTemplate;
	
	

	/* (non-Javadoc)
	 * @see com.diviso.graeshoppe.service.QueryService#findDeliveryinfobydatebetween(java.time.Instant, java.time.Instant)
	 */
	@Override
	public Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to, String storeId) {
		//.........
				SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(QueryBuilders.boolQuery()
						.must(termQuery("storeId", storeId)).must(rangeQuery("date").gte(from).lte(to))).build();

				return elasticsearchOperations.queryForPage(searchQuery, Order.class);
	}

	/* (non-Javadoc)
	 * @see com.diviso.graeshoppe.service.AggregateQueryService#findOrderCountByDateAndStatusName(java.lang.String, java.time.Instant)
	 */
	@Override
	public Long findOrderCountByDateAndStatusName(String statusName, Instant date) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH).withIndices("order").withTypes("order")
				.addAggregation(AggregationBuilders.terms("date").field("date.keyword")
						.order(org.elasticsearch.search.aggregations.bucket.terms.Terms.Order.aggregation("avgPrice",
								true))
						.subAggregation(AggregationBuilders.avg("avgPrice").field("grandTotal"))
						.subAggregation(AggregationBuilders.terms("statusName").field("status.name.keyword")))
				.build();

		AggregatedPage<Order> result = elasticsearchTemplate.queryForPage(searchQuery, Order.class);

		TermsAggregation orderAgg = result.getAggregation("date", TermsAggregation.class);
		List<Entry> storeBasedEntry = new ArrayList<Entry>();
		orderAgg.getBuckets().forEach(bucket -> {

			List<Entry> listStore = bucket.getAggregation("statusName", TermsAggregation.class).getBuckets();

			listStore.forEach(s -> {

				if (bucket.getKey().equals(date.toString())) {
					if (s.getKey().equals(statusName)) {

						storeBasedEntry.add(bucket.getAggregation("statusName", TermsAggregation.class).getBuckets().get(i));
					}
				}

				i++;
			});

		});
		storeBasedEntry.forEach(e->{
		count=	e.getCount();
		});
		return count;
	}

	/* (non-Javadoc)
	 * @see com.diviso.graeshoppe.service.AggregateQueryService#findOrderCountByStatusName(java.lang.String)
	 */
	@Override
	public Long findOrderCountByStatusName(String statusName) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH)

				.withIndices("order").withTypes("order")
				.addAggregation(AggregationBuilders.terms("statusName").field("status.name.keyword")).build();

		AggregatedPage<Order> result = elasticsearchTemplate.queryForPage(searchQuery, Order.class);
		TermsAggregation categoryAggregation = result.getAggregation("statusName", TermsAggregation.class);
		count = categoryAggregation.getBuckets().stream().filter(entry -> entry.getKey().equals(statusName)).findFirst()
				.get().getCount();

		return count;
	}

	
	@Override
	public Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).prefixLength(3)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Store.class);
	}

}
