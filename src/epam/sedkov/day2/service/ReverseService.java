package epam.sedkov.day2.service;

public class ReverseService{
	
	public void reverseArgs(String[] args){
		for(int i = args.length-1; i >= 0; i--){
			System.out.printf("\t%s", args[i]);
		}
	}
}