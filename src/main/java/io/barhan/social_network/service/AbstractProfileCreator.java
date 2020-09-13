package io.barhan.social_network.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import io.barhan.social_network.entity.Profile;
import io.barhan.social_network.util.DataBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractProfileCreator {
	@Autowired
	private DataBuilder dataBuilder;

	protected String buildProfileUid(String firstName, String lastName) {
		String uid = this.dataBuilder.buildProfileUid(firstName, lastName);
		return uid;
	}

	protected Profile createNewProfile(String firstName, String lastName, String password) {
		Profile profile = new Profile();
		profile.setUid(this.dataBuilder.buildProfileUid(firstName, lastName));
		profile.setFirstName(firstName);
		profile.setLastName(lastName);
		profile.setPassword(password);
		profile.setCompleted(false);
		return profile;
	}

	protected void logProfileCreatedInfoOnTransactionSuccess(final Profile profile) {
		TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
			@Override
			public void afterCommit() {
				log.info("New profile created: {}", profile.getUid());
			}
		});
	}
}
