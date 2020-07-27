package io.barhan.social_network.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.barhan.social_network.entity.Profile;
import io.barhan.social_network.repository.storage.ProfileRepository;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	private final ProfileRepository profileRepository;

	@Autowired
	public ProfileController(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	@GetMapping("/{uid}")
	public String getProfile(@PathVariable String uid, Model model) {
		Profile profile = this.profileRepository.findByUid(uid);
		if (profile == null) {
			return "profile_not_found";
		}
		model.addAttribute("profile", profile);
		return "profile";
	}
}
