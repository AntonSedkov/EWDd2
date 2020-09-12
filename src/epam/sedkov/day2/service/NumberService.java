package epam.sedkov.day2.service;

public class NumberService{
	
	public void printSumAndMultiple(String [] arg){
		if (arg.length>1){
			int sum = 0;
			int multiply = 1;
			boolean flag = true;
				for(int i = 0; i < arg.length; i++){
					if(arg[i].matches("\\d+")){
						int tmp= Integer.parseInt(arg[i]);
						sum += tmp;
						multiply *= tmp;	
					} else {
						flag = false;
						break;
					}
				}
			if (flag) {
				System.out.printf("Sum = %d, multiply = %d",sum, multiply);
			} else {
				System.err.println ("Wrong data input: not an integral value.");
			}
		} else {
			System.err.println("Need at least 2 integer arguments");
		}
	}
}