import { createReducer, on } from '@ngrx/store';

import { initialProfileState, ProfileState } from './profile.state';
import * as ProfileActions from './profile.actions';

export const profileReducer = createReducer<ProfileState>(
  initialProfileState,
  on(ProfileActions.load, (state) =>
    Object.assign({}, state, { isLoading: true, error: null })
  ),
  on(ProfileActions.loadSuccess, (_, { profile }) => ({
    profile,
    isLoading: false,
    error: null,
  })),
  on(ProfileActions.error)
);
