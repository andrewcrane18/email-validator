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
	@Test
	public void orderTrue(){
		email = "example@example.com";
		assertTrue("email is invalid", Validator.order(email));
	}
	@Test
	public void orderFalse(){
		email = ".comexample@";
		assertFalse("email is valid", Validator.order(email));
	}
	@Test
	public void trueStart(){
		email = "example@example.com";
		assertTrue("email start's with invalid character", Validator.validStart(email));
		
	}
	@Test
	public void falseStart(){
		email = "-example@example.com";
		assertFalse("Email start's with valid characater", Validator.validStart(email));
	}
}
