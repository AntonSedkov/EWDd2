package epam.sedkov.day2.service;

import java.lang.Math;

public class RandomService{
	
	public void printNumber(String arg){
		if (arg.matches("\\d+")){
			int size = Integer.parseInt(arg);
			if(size>0){
				for(int i = 0; i < size; i++){
					System.out.printf("\t%.3f", Math.random());	
				}
				System.out.println();
				for(int i = 0; i < size; i++){
					System.out.printf("%.3f%n", Math.random());
				}
			} else {
				System.err.println("Your argument must be more than 0");
			}	
		} else {
			System.err.println("Your argument is not a number");		
		}
	}
}