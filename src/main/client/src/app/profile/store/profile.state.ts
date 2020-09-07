import { Profile } from '../model/profile.class';

export interface ProfileState {
  profile: Profile;
  isLoading: boolean;
  error: any;
}

export const initialProfileState: ProfileState = {
  profile: Profile.create(),
  isLoading: true,
  error: null,
};

export const selectProfile = (state: ProfileState) => state.profile;
export const selectIsLoading = (state: ProfileState) => state.isLoading;
export const selectError = (state: ProfileState) => state.error;
