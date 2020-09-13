package io.barhan.social_network.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.barhan.social_network.entity.Profile;
import io.barhan.social_network.form.SignUpForm;
import io.barhan.social_network.repository.ProfileRepository;
import io.barhan.social_network.service.AbstractProfileCreator;
import io.barhan.social_network.service.ProfileService;

@Service
public class ProfileServiceImpl extends AbstractProfileCreator implements ProfileService {

	private ProfileRepository profileRepository;

	public ProfileServiceImpl(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	@Override
	public Profile findByUid(String uid) {
		return this.profileRepository.findByUid(uid);
	}

	@Override
	@Transactional
	public Profile createNewProfile(SignUpForm form) {
		Profile profile = this.createNewProfile(form.getFirstName(), form.getLastName(), form.getPassword());
		profileRepository.save(profile);
		this.logProfileCreatedInfoOnTransactionSuccess(profile);
		return profile;
	}

}
