package validator;

public class Validator {

	public static boolean validate(String email) {
		// TODO Auto-generated method stub
		if(email.contains("@")&&email.contains(".")){
			return true;
		}
		else return false;
	}

}
