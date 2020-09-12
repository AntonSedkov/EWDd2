package epam.sedkov.day2.main;

import epam.sedkov.day2.service.StringService;

public class Task4{
	public static void main (String[] args){
		if(args.length > 0) {
			new StringService().checkString(args);
		} else {
			System.err.println("You are not enter anything for arguments");
		}
	}
}