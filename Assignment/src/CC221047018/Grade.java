package CC221047018;

class Grade{
	int marksScored(int m) {
		if(m>=0&&m<=59) {
			System.out.println(String.format("Grade value for Marks Scored %d : F",m));
		}
		else if(m>=60&&m<=69) {
			System.out.println(String.format("Grade value for Marks Scored %d : D",m));
		}
		else if(m>=70&&m<=79) {
			System.out.println(String.format("Grade value for Marks Scored %d : C",m));
		}
		else if(m>=80&&m<=89) {
			System.out.println(String.format("Grade value for Marks Scored %d : B",m));
		}
		else if(m>=90&&m<=100) {
			System.out.println(String.format("Grade value for Marks Scored %d : A",m));
		}
		else {
			System.out.println("Wrong marks Entered, Please try again");
		}return 0;
	}
}