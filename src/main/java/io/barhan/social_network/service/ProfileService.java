package io.barhan.social_network.service;

import io.barhan.social_network.entity.Profile;

public interface ProfileService {
	Profile findByUid(String uid);
}
