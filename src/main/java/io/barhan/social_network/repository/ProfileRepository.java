package io.barhan.social_network.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.barhan.social_network.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
	Profile findByUid(String uid);
}
