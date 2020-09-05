package io.barhan.social_network.service.impl;

import org.springframework.stereotype.Service;

import io.barhan.social_network.entity.Profile;
import io.barhan.social_network.repository.ProfileRepository;
import io.barhan.social_network.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	private ProfileRepository profileRepository;

	public ProfileServiceImpl(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	@Override
	public Profile findByUid(String uid) {
		return this.profileRepository.findByUid(uid);
	}

}
