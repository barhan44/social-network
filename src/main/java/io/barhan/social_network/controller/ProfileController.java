package io.barhan.social_network.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.barhan.social_network.entity.Profile;
import io.barhan.social_network.form.SignUpForm;
import io.barhan.social_network.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	private ProfileService profileService;

	public ProfileController(ProfileService profileService) {
		this.profileService = profileService;
	}

	@GetMapping("/{uid}")
	public Profile getProfile(@PathVariable String uid) {
		return this.profileService.findByUid(uid);
	}
	
	@PostMapping("/create")
	public Profile create(@RequestBody SignUpForm form) {
		return this.profileService.createNewProfile(form);
	}
}
