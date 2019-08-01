import { NgModule } from '@angular/core';

import { AdminConsoleSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [AdminConsoleSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [AdminConsoleSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class AdminConsoleSharedCommonModule {}
