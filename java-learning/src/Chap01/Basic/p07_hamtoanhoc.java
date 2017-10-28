package Chap01.Basic;

public class p07_hamtoanhoc {
	public static void main(String[] args) {
		int numberOne 		= 20;
		int numberTwo 		= 10;
		double numberThree 	= 123.645;
		
		int maxNumber 		= Math.max(numberOne, numberTwo);
		System.out.println("Max = " + maxNumber);
		
		int minNumber 		= Math.min(numberOne, numberTwo);
		System.out.println("Min = " + minNumber);
		
		//Ham lam tron len:
		System.out.println("Lam tron len numberThree: " + Math.ceil(numberThree));
		
		//Ham lam tron xuong
		System.out.println("Lam tron xuong numberThree: " + Math.floor(numberThree));
		
		//Ham lam tron round
		System.out.println("Lam tron numberThree: " + Math.round(numberThree));
		
		//Ham sinh so ngau nhien
		System.out.println(Math.random()); // Ham nay sinh ra so ngau nhien thuoc doan [0,1]
		
		//Tao so nguyen ngau nhien nam giua 2 so?
		int start 	= 10;
		int end 	= 20;
		System.out.println((int)(Math.random() * (end - start + 1) + start));
		
	}
}
