package epam.sedkov.day2.main;

public class Hello{
	public static void main (String[] args){
		if (args.length > 0) {
            		int i=0;
            		while (i<args.length){
                		System.out.printf("Hello %s!!!%n", args[i]);
                		i++;
        		}
		} else {
           		System.err.println("You are not enter anything for arguments");
        	}
	}
}