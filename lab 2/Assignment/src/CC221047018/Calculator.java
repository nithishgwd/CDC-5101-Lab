package CC221047018;

class Calculator{
	int Calc(int first, int second){
		int add,sub,multip; 
		double div;
		add = first+second;
		sub = first-second;
		div = (double)first/second;
		multip = first*second;
		System.out.println("Calculation of given two numbers: ");
		System.out.println("Addition      : "+add);
		System.out.println("Subtraction   : "+sub);
		System.out.println("Division      : "+div);
		System.out.println("Multiplication: "+multip);
	
	return 0;
	}
}
