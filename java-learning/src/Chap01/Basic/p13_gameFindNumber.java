package Chap01.Basic;

import java.util.Scanner;

public class p13_gameFindNumber {
	public static void main(String[] args){
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 1;
		int range = (MAX_NUMBER - MIN_NUMBER) + 1;
		int randomNumber = (int) (Math.random() * range) + MIN_NUMBER;
		
		Scanner sc = new Scanner(System.in);
		int youNumber = 0;
		int score = 0;

		while (youNumber != randomNumber){
			System.out.println("Enter your number: ");
			youNumber = sc.nextInt();
			if(youNumber == randomNumber){
				System.out.println("Done");
			} else if(youNumber > randomNumber){
				System.out.println("You need enter number less than");
			} else{
				System.out.println("You need enter number greater than");
			}
			score += 1;
		}
		
		System.out.print("score = " + (score));
	}
}
