package Chap01.Basic;

/*
 * Bai tap 1: In bang cuu chuong cua 1 so
 * Bai tap 2: In bang cuu chuong day du
 */
public class p10_baitap {
	public static void main(String[] args) {
		// BT 1:
		int number = 3;
		
		for(int i = 1; i <= 10; i++){
			System.out.println(number + " x " + i + " = " + number * i);
		}
		
		// BT 2:
		
		for(int i = 1; i <= 10; i++){
			System.out.println("Bang cuu chuong " + i);
			
			int j = 1;
			while(j <= 10){
				System.out.println(i + " x " + j + " = " + i * j);
				j += 1;
			}
		}
	}
}

