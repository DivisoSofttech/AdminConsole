package com.diviso.graeshoppe.service.impl;

import java.time.Instant;

import org.elasticsearch.index.query.QueryBuilders;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.service.AggregateQueryService;

@Service
public class AggregateQueryServiceImpl implements AggregateQueryService {
	
	@Autowired
	ElasticsearchOperations elasticsearchOperations;

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

}
