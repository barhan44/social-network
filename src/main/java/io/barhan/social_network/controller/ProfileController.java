package io.barhan.social_network.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.barhan.social_network.entity.Profile;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	@GetMapping("/{uid}")
	public Profile getProfile(@PathVariable String uid) {
		final Profile profile = new Profile();
		profile.setFirstName("Ivan");
		profile.setLastName("Ivanov");
		profile.setPhone("+7-999-999-99-99");
		profile.setEmail("test@test.com");
		profile.setCity("Gorky-17");
		profile.setCountry("Russia");
		profile.setBirthDay(new Date(728861955903L));
		return profile;
	}
}
