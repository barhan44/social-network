import { Profile } from '../model';
import { initialProfileState } from './profile.state';

export interface RootState {
  profile: Profile;
}

export const initialRootState: RootState = {
  profile: initialProfileState,
};

export const getInitialRootState = () => initialRootState;
