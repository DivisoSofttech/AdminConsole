import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { AdminConsoleSharedLibsModule, AdminConsoleSharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [AdminConsoleSharedLibsModule, AdminConsoleSharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [AdminConsoleSharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AdminConsoleSharedModule {
    static forRoot() {
        return {
            ngModule: AdminConsoleSharedModule
        };
    }
}
