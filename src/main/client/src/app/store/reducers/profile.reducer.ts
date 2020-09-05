import { initialProfileState } from '../state/profile.state';
import { EProfileActions, ProfileActions } from '../actions/profile.actions';
import { Profile } from '../model';

export const ProfileReducer = (
  state = initialProfileState,
  action: ProfileActions
): Profile => {
  switch (action.type) {
    case EProfileActions.LOAD_PROFILE:
      return {
        ...state,
        ...action.payload,
      };
  }
};
