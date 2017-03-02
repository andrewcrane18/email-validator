package test;

import static org.junit.Assert.*;

import org.junit.Test;

import validator.Validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorTest {
	String email;
	@Test
	public void testFalse() {
		email = "example";
		assertFalse("email is valid",Validator.validate(email));
	}
	@Test
	public void testTrue() {
		email = "example@example.com";
		assertTrue("email is in valid",Validator.validate(email));
	}
}
