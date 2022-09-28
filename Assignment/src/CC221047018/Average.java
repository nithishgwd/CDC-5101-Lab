package CC221047018;

import java.util.Scanner;

class Average{
	int Avg() {
		int sum=0;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of count required: ");
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			j=i+1;
			System.out.println("Enter number "+j);
			sum+=sc.nextInt();
		}
		sc.close();
		double average = sum/(double)n;
		System.out.println("Average of give "+n+" numbers are: "+average);
		return 1;
	}
}