package com.company.app.module.constraint.validator;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.easymock.IMockBuilder;
import org.junit.Test;

public class FooNoImplementsConstraintValidatorTest {

	List<Object> mockObjects = new ArrayList<>();

	@Test
	public void testValid() throws Exception {
		// mock generated, and passes
		FooNoImplementsConstraintValidator validator = createPartialMock(FooNoImplementsConstraintValidator.class);

		replayMocks();

		boolean result = validator.isValid(null, null);
		assertTrue(result);

		verifyMocks();
	}

	protected <T> T createPartialMock(final Class<T> toMock, Method... methods) {
		IMockBuilder<T> mockBuilder = EasyMock.createMockBuilder(toMock);
		mockBuilder.addMockedMethods(methods);
		T mockObject = mockBuilder.createMock();
		mockObjects.add(mockObject);
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