import { Injectable } from '@angular/core';
import { createFeatureSelector, createSelector, Store } from '@ngrx/store';
import { Observable } from 'rxjs';

import { StoreService } from '../../store/store.service';
import { RootState } from '../../store/root.reducer';
import { Profile } from '../model/profile.class';
import * as ProfileActions from './profile.actions';
import * as state from './profile.state';

@Injectable()
export class ProfileStoreService extends StoreService {
  private profileState = createFeatureSelector<state.ProfileState>('profile');
  private getProfileState = createSelector(this.profileState, state.selectProfile);
  private isLoading = createSelector(this.profileState, state.selectIsLoading);
  private error = createSelector(this.profileState, state.selectError);

  constructor(protected store: Store<RootState>) {
    super();
  }

  dispatchLoadAction(): void {
    this.dispatchAction(ProfileActions.load());
  }

  dispatchCreateAction(entity: any): void {}

  dispatchRemoveAction(id: string): void {}

  dispatchUpdateAction(entity: any): void {}

  getProfile(): Observable<Profile> {
    return this.store.select(this.getProfileState);
  }

  getIsLoading(): Observable<boolean> {
    return this.store.select(this.isLoading);
  }

  getError(): Observable<any> {
    return this.store.select(this.error);
  }
}
