package Chap01.Basic;

/* Toan tu toan hoc
 * 1. Toan tu so hoc: +; -; *; /; %
 * 2. Toan tu gan: +=; -=; *=; /=; %=
 * 3. Toan tu ++; --
 * 4. Toan tu so sanh: >; >=; <; <=; ==; !=; <>; ===; !===
 * 5. Toan tu logic: &&, ||, !
 * 6. Toan tu dich bit
 */

public class p06_toantusohoc {
	public static void main(String[] args) {
		int numberOne = 20;
		int numberTwo = 3;
		int result;
		
		// Phep +
		result = numberOne + numberTwo;
		System.out.println(numberOne + " + " + numberTwo + " = " + result);
		
		// Phep -
		result = numberOne - numberTwo;
		System.out.println(numberOne + " - " + numberTwo + " = " + result);
		
		// Phep *
		result = numberOne * numberTwo;
		System.out.println(numberOne + " * " + numberTwo + " = " + result);
		
		// Phep / (chia lay phan nguyen)
		result = numberOne / numberTwo;
		System.out.println(numberOne + " / " + numberTwo + " = " + result);
		
		// Phep % (chia lay du)
		result = numberOne % numberTwo;
		System.out.println(numberOne + " % " + numberTwo + " = " + result);
		
		/* ==========================
		 * numberStart++ tra ve gia tri cua numberStart, sau do tang gia tri cua numberStart len 1dv
		 * numberStart++ tra ve gia tri cua numberStart, sau do giam gia tri cua numberStart xuong 1dv
		 * ++numberStart tang gia tri numberStart len 1dv, sau do tra ve gia tri cua numberStart
		 * --numberStart giam gia tri numberStart xuong 1dv, sau do tra ve gia tri cua numberStart
		 */
		
		int numberStart = 20;
		int numberEnd = 0;
		
		numberEnd = ++numberStart;
		System.out.println("numberEnd = " + numberEnd);
		System.out.println("numberStart = " + numberStart);
		
		
		/*
		 * Phep so sanh tra ve kieu boolean
		 */
		boolean result2;
		result2 = numberOne > numberTwo;
		System.out.println(numberOne + " > " + numberTwo + " is " + result2);
		
		result2 = (numberOne > numberTwo) && (numberOne == numberTwo);
		System.out.println(result2); // manh de tren la sai
		result2 = (numberOne > numberTwo) || (numberOne >= numberTwo);
		System.out.println(result2); // menh de tren la dung
	}
}
