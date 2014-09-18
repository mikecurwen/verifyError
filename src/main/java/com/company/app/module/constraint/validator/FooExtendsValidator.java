package com.company.app.module.constraint.validator;


import javax.validation.ConstraintValidator;

import com.company.app.module.constraint.ValidFoo;
import com.company.app.module.domain.Foo;

public class FooExtendsValidator extends FooNoImplementsConstraintValidator implements ConstraintValidator<ValidFoo, Foo> {

	@Override
	public void initialize(ValidFoo validFoo) {

	}


}
