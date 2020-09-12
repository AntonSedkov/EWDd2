package epam.sedkov.day2.main;

import epam.sedkov.day2.service.ReverseService;

public class Task2{
	public static void main (String[] args){
		if(args.length > 0) {
			new ReverseService().reverseArgs(args);
		} else {
			System.err.println("You are not enter anything for arguments");
		}	
	}
}