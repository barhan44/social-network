package io.barhan.social_network.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpForm extends PasswordForm {
	private String firstName;

	private String lastName;
}
