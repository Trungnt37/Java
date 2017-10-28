package Chap01.Basic;

import java.util.Scanner;

public class p12_calculator {
	public static void main(String[] args){
		int numberFirst;
		int numberSecond;
		int result = 0;
		String calculate;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number first: ");
		numberFirst = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter number second: ");
		numberSecond = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter calculate: ");
		calculate = sc.nextLine();
		sc.close();
		
		System.out.println("\n======CALCULATOR=======");

		switch (calculate) {
		case "+":
			result = numberFirst + numberSecond;
			break;
		case "-":
			result = numberFirst - numberSecond;
			break;
		case "*":
		case "x":
			result = numberFirst * numberSecond;
			break;
		case "/":
			result = numberFirst / numberSecond;
			break;
		case "%":
			result = numberFirst % numberSecond;
			break;
		default:
			System.out.println("calculate not right");
			break;
		}
		System.out.printf("%d %s %d = %d", numberFirst, calculate, numberSecond, result);
	}

}
