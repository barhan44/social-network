import { ActionReducerMap } from '@ngrx/store';

import { RootState } from '../state/root.state';
import { ProfileReducer } from './profile.reducer';

// tslint:disable-next-line:no-any
export const rootReducer: ActionReducerMap<RootState, any> = {
  profile: ProfileReducer,
};
