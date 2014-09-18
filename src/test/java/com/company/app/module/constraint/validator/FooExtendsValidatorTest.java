package com.company.app.module.constraint.validator;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidatorContext;

import org.easymock.EasyMock;
import org.easymock.IMockBuilder;
import org.junit.Test;

public class FooExtendsValidatorTest {

	List<Object> mockObjects = new ArrayList<>();
	ConstraintValidatorContext constraintValidatorContext;

	@Test
	public void testValid() throws Exception {
		// cannot generate mock
		FooExtendsValidator validator = createPartialMock(FooExtendsValidator.class);

		replayMocks();

		boolean result = validator.isValid(null, constraintValidatorContext);
		assertTrue(result);

		verifyMocks();
	}

	protected <T> T createPartialMock(final Class<T> toMock, Method... methods) {
		IMockBuilder<T> mockBuilder = EasyMock.createMockBuilder(toMock);
		mockBuilder.addMockedMethods(methods);
		T mockObject = mockBuilder.createMock();
		mockObjects.add(mockObject);
		constraintValidatorContext = EasyMock.createMock(ConstraintValidatorContext.class);
		mockObjects.add(constraintValidatorContext);
		return mockObject;
	}

	protected void replayMocks() {
		for (Object mockObject : mockObjects) {
			EasyMock.replay(mockObject);
		}
	}

	protected void verifyMocks() {
		for (Object mockObject : mockObjects) {
			EasyMock.verify(mockObject);
		}
	}


}