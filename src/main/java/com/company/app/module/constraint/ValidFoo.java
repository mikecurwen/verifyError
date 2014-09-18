package com.company.app.module.constraint;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


import com.company.app.module.constraint.validator.FooExtendsValidator;

@Target( { TYPE, METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = FooExtendsValidator.class)
@Documented
public @interface ValidFoo {
	public static final String DEFAULT = "{}";

	String message() default DEFAULT;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
