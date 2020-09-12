package epam.sedkov.day2.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarService {
    	public void checkDeveloperDate(String [] args){
		if (args.length%2 == 0) {
        		for (int i = 0; i<args.length; i+=2){
            			if (args[i].matches("[A-Za-z]+") && args[i+1].matches("\\d+")){
					String surname = args[i];
            				int days = Integer.parseInt(args[i+1]);
            				Calendar calendar = new GregorianCalendar();
            				calendar.roll(Calendar.DAY_OF_MONTH,days);
            				System.out.printf("%s is going to be ready in %d days. Task has to be done till %tF %tT.%n",
                    					surname, days, calendar, calendar.getTime());
				} else {
					System.err.println("Wrong input data");	
				}
        		}
    		} else {
			System.err.println("Need even quantity of arguments");
		}
	}

	public void checkBirthdayDate(String[] args) {
        	if (args.length % 3 == 0) {
            		for (int i = 0; i < args.length; i += 3) {
                		if (args[i].matches("^[0-3]?[0-9]$") &&
                        		args[i + 1].matches("^[0-1]?[0-9]$") &&
                        		args[i + 2].matches("^[1-2]?[0-9]{0,2}[0-9]$") ){

                    				int day = Integer.parseInt(args[i]);
                    				int month = Integer.parseInt(args[i + 1]);
                    				int year = Integer.parseInt(args[i + 2]);
                    				Calendar birthday = new GregorianCalendar(year, month-1, day);
                    				Calendar now = new GregorianCalendar(Calendar.getInstance().getTimeZone());
                    				Locale.setDefault(Locale.ENGLISH);
                    				System.out.printf("You were born on %tA. ", birthday.getTime());
                    				int age = now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

                    					if (now.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) ||
                            					(now.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) &&
                                    				now.get(Calendar.DAY_OF_MONTH) < birthday.get(Calendar.DAY_OF_MONTH))) {
                        						age--;
                        						System.out.printf("You are %d years old.%n", age);
                    					} else if (now.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) &&
                            					now.get(Calendar.DAY_OF_MONTH) == birthday.get(Calendar.DAY_OF_MONTH)) {
                        						System.out.printf("You are %d years old. %s%n", age, "HAPPY BIRTHDAY!!!");
                    					} else {
                        					System.out.printf("You are %d years old.%n", age);
                    					}
                		} else {
                    			System.err.println("Wrong input data");
                   			break;
                		}
            		}
        	} else {
            		System.err.println("Quantity of arguments must be a multiple of three");
        	}
    	}

}