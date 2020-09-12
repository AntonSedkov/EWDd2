package epam.sedkov.day2.main;

import epam.sedkov.day2.service.RandomService;

public class Task3{
	public static void main (String[] args){
		if(args.length > 0) {
			new RandomService().printNumber(args[0]);
		} else {
			System.err.println("You are not enter anything for arguments");
		}
	}
}