package epam.sedkov.day2.main;

import epam.sedkov.day2.service.CalendarService;

public class Task6{
	public static void main (String[] args){
		if(args.length > 0) {
			new CalendarService().checkDeveloperDate(args);
		} else {
			System.err.println("You are not enter anything for arguments");
		}
	}
}