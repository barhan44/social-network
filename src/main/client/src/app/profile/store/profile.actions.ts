import { createAction, props } from '@ngrx/store';

import { Profile } from '../model/profile.class';

export enum ProfileActions {
  LOAD = '[Profile] LOAD Requested',
  LOAD_SUCCESS = '[Profile] LOAD Success',
  ERROR = '[Profile] Error',
}

export const load = createAction(ProfileActions.LOAD, props<{ uid: string }>());
export const loadSuccess = createAction(
  ProfileActions.LOAD_SUCCESS,
  props<{ profile: Profile }>()
);
export const error = createAction(ProfileActions.ERROR, props<any>());
