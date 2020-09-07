import { routerReducer, RouterReducerState } from '@ngrx/router-store';
import { ActionReducerMap } from '@ngrx/store';

export interface RootState {
  routerReducer: RouterReducerState;
}

export const reducers: ActionReducerMap<RootState> = {
  routerReducer,
};
