package io.barhan.social_network.util;

import org.apache.commons.text.WordUtils;

public class DataUtil {
	public static String normalizeString(String str) {
		return str.trim().toLowerCase();
	}

	public static String capitalizeString(String str) {
		return WordUtils.capitalize(str);
	}
}
