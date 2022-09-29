package CC221047018;

import java.util.Scanner;


public class Interactive{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To calculate Average of n numbers enter: 1");
		System.out.println("to Simple Calculator enter             : 2");
		System.out.println("To calcualte grade value               : 3");
		System.out.println("Enter your choice here                 :  ");
		int c = sc.nextInt();
		
		switch(c) {
		case 1:
			Average newAvg = new Average();
			newAvg.Avg();
			break;
			
		case 2:
			System.out.println("Enter 1st number: ");
			int firstNumber = sc.nextInt();
			System.out.println("Enter 1st number: ");
			int secondNumber = sc.nextInt();
			Calculator newCalc = new Calculator();
			newCalc.Calc(firstNumber, secondNumber);
			
		case 3:
			Grade newGrade = new Grade();
			System.out.println("Enter Marks scored to know Grade: ");
			int m = sc.nextInt();
			newGrade.marksScored(m);
		}
		
		sc.close();
		
	}

}

