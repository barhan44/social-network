import { Action } from '@ngrx/store';
import { Profile } from '../model';

export enum EProfileActions {
  LOAD_PROFILE = 'LOAD_PROFILE',
}

export class LoadProfile implements Action {
  public readonly type = EProfileActions.LOAD_PROFILE;

  constructor(public payload: Profile) {}
}

export type ProfileActions = LoadProfile;
