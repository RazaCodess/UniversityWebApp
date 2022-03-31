package com.project.firstMvcProject;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<UserNameConstraint, String> {
	
	
	private String username;
	
	@Override
    public void initialize(UserNameConstraint usernameConstraint) {
		this.username = usernameConstraint.username();
    }

    @Override
    public boolean isValid(String username,
      ConstraintValidatorContext cxt) {
        if(!username.matches("plamsal"))
        	return false;
        return true;
    }

}
