package flowControl;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in); // Create a Scanner object
//		System.out.println("Enter first name");
//		String userName = scanner.nextLine(); // Read user input
//		
//		
//		System.out.println("Enter your last name ");
//		String lastName = scanner.nextLine();
//		
//		System.out.println("Enter your phone number");
//		long phoneNumber = scanner.nextLong();
//		
//		System.out.println("Your name is : "+ userName + " "+ lastName ); // Output user input
//		System.out.println("Your phone number is : " + phoneNumber);
//		scanner.close();

		
		//Munira
//		Scanner scanner = new Scanner(System.in);// create scanner object
//		
//		System.out.println("Enter first name");
//		String firstname = scanner.nextLine();// read user input
//		
//		System.out.println("Enter last name");// output user input
//		String lastname = scanner.nextLine();
//		
//		System.out.println("Enter Street Address");
//		String StreetAddress = scanner.nextLine();
//		
//		System.out.println("Enter phone Number");
//		long phoneNumber = scanner.nextLong();
//		
//		System.out.println("Enter ages");
//		int Ages = scanner.nextInt();
//		
//		System.out.println("Enter Hight");
//		double Hight = scanner.nextDouble();
//		
//		System.out.println("Enter weight");
//		float weight = scanner.nextFloat();
//		
//		System.out.println("Enter Contry");
//		String Contry = scanner.next();
//		
//		System.out.println("My name is:" + firstname + " " + lastname + " " + phoneNumber + " " + StreetAddress + " "
//				+ Ages + " " + Hight + " " + weight + " " + Contry);
//		scanner.close();

		
		//Tom
		
		Scanner scanner = new Scanner(System.in);//Create a Scanner object
//		System.out.println("Enter your first name");
//		String userName = scanner.nextLine(); //Read user input
//				
//		System.out.println("Enter your last name");
//		String lastName = scanner.nextLine();
//		
//		System.out.println("Enter your address");
//		String address = scanner.nextLine();
//		
//		System.out.println("Enter your City");
//		String City = scanner.nextLine();
//		
//		System.out.println("Enter your State");
//		String State = scanner.nextLine();
//		
//		System.out.println("Enter your phone number");
//		long phoneNumber = scanner.nextLong();
//		
//		System.out.println("Enter your age");
//		int age = scanner.nextInt();
//		
//		System.out.println("Enter your height");
//		double height = scanner.nextDouble();
//		 
//
//		System.out.println("Enter your zip");
//		int Zip = scanner.nextInt();
//		
//		System.out.println("Your name is: "+ userName + ""+ lastName); //Output user input
//		System.out.println("Your age is: "+ age); //Output user input
//		System.out.println("Your height is: "+ height);
//		System.out.println("Your phonenumber is: "+ phoneNumber);
//		System.out.println("Your address is: "+ address);
//		System.out.println("Your City is: "+ City);
//		System.out.println("Your State is: "+ State);
//		System.out.println("Your address is: "+ address);
//		System.out.println("Your address is: "+ Zip);
//		
		System.out.println("Please enter your integer value a : ");
		int a = scanner.nextInt();
		
		System.out.println("Please slect one of the Operator: addition , subtraction , multiplication , division");
		String  operation = scanner.next();
		
		int result = 0;
		System.out.println("Please enter your second Integer number");
		int b = scanner.nextInt();
		
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
		
		
		
		scanner.close();
		
	}
}
