package io.barhan.social_network.service;

import io.barhan.social_network.entity.Profile;
import io.barhan.social_network.form.SignUpForm;

public interface ProfileService {
	Profile findByUid(String uid);
	
	Profile createNewProfile(SignUpForm form);
}
