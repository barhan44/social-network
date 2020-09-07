import { NgModule } from '@angular/core';
import { StoreModule } from '@ngrx/store';
import { EffectsModule } from '@ngrx/effects';

import { ProfileStoreService } from './profile-store.service';
import { profileReducer } from './profile.reducer';
import { ProfileEffects } from './profile.effects';

@NgModule({
  imports: [
    StoreModule.forFeature('profile', profileReducer),
    EffectsModule.forFeature([ProfileEffects]),
  ],
  exports: [StoreModule, EffectsModule],
  providers: [ProfileStoreService],
})
export class ProfileStoreModule {}
