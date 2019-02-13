package Java;

import java.util.Scanner;

public class ArithmatricOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the first number ");
		
		Scanner scan = new Scanner(System.in);
		int FirstNo = scan.nextInt();
		System.out.println("Enter the first number ");
		
		int SecndNo = scan.nextInt();
		System.out.println("Enter the Arith operation to perform");
	
		String op  = scan.nextLine();
		
		Integer Ans = 0;
	
		switch(op) {
		case "Add" :
			Ans = FirstNo + SecndNo;
			System.out.println("Answer is" +Ans);
			break;
		case "Subtract" :
			Ans = FirstNo + SecndNo;
			System.out.println("Answer is" +Ans);
			break;
		case "Multiply" :
			Ans = FirstNo * SecndNo;
			System.out.println("Answer is" +Ans);
			break;
		case "Divide" :
			Ans = FirstNo / SecndNo;
			System.out.println("Answer is" +Ans);
			break;
		}
		scan.close();
		
	}

}
