package com.company.app.module.constraint.validator;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintValidatorContext;

import com.company.app.module.domain.Foo;
import com.company.app.module.domain.FooChild;

public class FooNoImplementsConstraintValidator {

	public boolean isValid(Foo foo, ConstraintValidatorContext constraintValidatorContext) {

		if (foo == null) {
			return true;
		}

		return validateFoo(foo);
	}


	boolean validateFoo(Foo foo) {
		boolean valid = true;
		List<FooChild> fooChildren = Arrays.asList(
				new FooChild(1L, "code1", "short1")
				, new FooChild(2L, "code2", "short2")
		);
		FooChild found = fooChildren.stream()
				.filter(fc -> fc.getCodeName().equals(foo.getFooChild().getCodeName()))
				.collect(Collectors.toList())
				.get(0);
		if (found == null) {
			valid=false;
		}
		return valid;
	}


}
