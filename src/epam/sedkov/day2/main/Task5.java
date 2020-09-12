package epam.sedkov.day2.main;

import epam.sedkov.day2.service.NumberService;

public class Task5{
	public static void main (String[] args){
		if(args.length > 0) {
			new NumberService().printSumAndMultiple(args);
		} else {
			System.err.println("You are not enter anything for arguments");
		}        	
	}
}