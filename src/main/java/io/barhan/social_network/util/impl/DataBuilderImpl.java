package io.barhan.social_network.util.impl;

import org.springframework.stereotype.Component;

import io.barhan.social_network.util.DataBuilder;
import io.barhan.social_network.util.DataUtil;

@Component
public class DataBuilderImpl implements DataBuilder {
	private static final String UID_DELIMETER = "-";

	@Override
	public String buildProfileUid(String firstName, String lastName) {
		return DataUtil.normalizeString(firstName) + UID_DELIMETER + DataUtil.normalizeString(lastName);
	}

}
