import { NgModule } from '@angular/core';
import { StoreModule } from '@ngrx/store';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { StoreRouterConnectingModule } from '@ngrx/router-store';
import { EffectsModule } from '@ngrx/effects';

import { reducers } from './root.reducer';
import { environment } from '../../environments/environment';

@NgModule({
  imports: [
    StoreModule.forRoot(reducers),
    StoreRouterConnectingModule.forRoot(),
    EffectsModule.forRoot([]),
    !environment.production
      ? StoreDevtoolsModule.instrument({ maxAge: 50 })
      : [],
  ],
  exports: [StoreModule],
})
export class RootStoreModule {}
