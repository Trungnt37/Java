package Chap01.Basic;

/*
 * Cau dieu kien IF
 * Cau dieu kien IF ELSE
 * Cau dieu kien IF ELSE IF ELSE
 * Cau dieu kien SWITCH
 */
public class p08_caudieukien {
	public static void main(String[] args) {
		int number = 0;
		// cau lenh if
		if (number % 2 == 0){
			System.out.println(number + " la so chan");
		}
		if (number % 2 != 0) System.out.println(number + " la so le");
		
		// cau lenh if (cach 2)
		String result = "so chan";
		if (number % 2 != 0) result = "so le";
		System.out.println(number + " la " + result);
				
		// cau lenh if else
		if (number % 2 == 0) {
			System.out.println(number + " la so chan");
		} else {
			System.out.println(number + " la so le");
		}
		
		// Cau lenh if else if else
		if (number == 0){
			System.out.println("number la so khong");
		} else if (number % 2 == 0){
			System.out.println("number la so chan");
		} else {
			System.out.println("number la so le");
		}
		
		// Cau dieu kien SWITCH
		int numberTwo = 1;
		switch(numberTwo){
			case 2:
				System.out.println("Thu 2");
				break; //Phai break, neu khong doan code phia duoi se van dc thuc thi
			case 3:
				System.out.println("Thu 3");
				break;
			case 4:
				System.out.println("Thu 4");
				break;
			case 5:
				System.out.println("Thu 5");
				break;
			case 6:
				System.out.println("Thu 6");
				break;
			case 7:
				System.out.println("Thu 7");
				break;
			default:
				System.out.println("Chu nhat");
		}
		
	}
}
