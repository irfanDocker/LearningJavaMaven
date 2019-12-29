package flowControl;

public class LearningIfElseStatement {

	public static void main(String[] args) {
		// Syntax

//		if (boolean condition) {
//			your statement
//		} else if (boolean condition) {
//		}else {
//			
//		}

//		boolean condition = false;
//		
//		if (condition) {
//			System.out.println("Hello I'm here");
//		}else {
//			System.out.println("Your condition is false");
//		}

//		int a = 14;
//		int b = 9;
//		int result = 0;
//		String operation;

//		if (a <= b) {
//			System.out.println(a <= b);
//		}else if (a>b ) {
//			a++;
//			System.out.println(" A > B");
//		}
//		
//		else {
//			System.out.println("Your condition is false");
//		}
//		
//		// 
//		System.out.println(a);

//		a++  ---->    a  = a + 1;
//		a--  ---->    a  = a - 1;
//		Task Create sample calculator using if else statement. 

		int a = 14;
		int b = 9;
		int result = 0;
		String operation = "subtraction";

//		if (operation.contentEquals("addition")) {
//			result = a + b;
//		}else {
//			System.out.println("Please select different operator");
//		}
//		
//		if (operation.contentEquals("subtraction")) {
//			result = a - b;
//		}else {
//			System.out.println("Please select different operator");
//		}	
//		
//		if (operation.contentEquals("multilpication")) {
//			result = a * b;
//		}else {
//			System.out.println("Please select different operator");
//		}
//		
//		if (operation.contentEquals("division")) {
//			result = a / b;
//		}else {
//			System.out.println("Please select different operator");
//		}

		if (operation.contentEquals("addition")) {
			result = a + b;
		} else if (operation.contentEquals("subtraction")) {
			result = a - b;
		} else if (operation.contentEquals("multilpication")) {
			result = a * b;
		} else if (operation.contentEquals("division")) {
			result = a / b;
		} else {
			System.out.println("Your entry is not valid");
		}

		System.out.println("Your Result is : " + result);

	}

}
