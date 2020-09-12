package epam.sedkov.day2.service;

public class StringService {
	public static final String STRING_REGEXP = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{5,}$";

    	public void checkString(String[] args) {
        	for (int i = 0; i < args.length; i++) {
			boolean result = args[i].matches(STRING_REGEXP);
            		System.out.printf("Password %d: %s.%n", i+1, result ? "match" : "doesn't match");
        	}
    	}
}