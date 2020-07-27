package io.barhan.social_network.repository.storage;

import org.springframework.data.repository.RepositoryDefinition;

import io.barhan.social_network.entity.Profile;

@RepositoryDefinition(domainClass = Profile.class, idClass = Long.class)
public interface ProfileRepository {
	Profile findByUid(String uid);
}
