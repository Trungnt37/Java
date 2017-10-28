package Chap01.Basic;

/*
 * break: nhay ra khoi vong lap
 * continue: dung vong lap tai gia tri do va nhay sang gia tri khac trong v.lap 
 */

public class p11_break_ontinue {
	public static void main(String[] args){
		// break: Khi i chia het cho 5, java thoat khoi vong lap for
		System.out.println("*****break*****");
		for(int i = 1; i < 20; i++){
			if(i % 5 == 0){
				System.out.println("OK! i = " + i);
				break;
			}
			System.out.println("i = " + i);
		}

		
		// continue: Khi i chia het cho 7, java next sang gia tri i+1
		System.out.println("*****continue*****");
		for(int i = 100; i < 120; i++){
			if(i % 7 == 0){
				System.out.println("OK! i = " + i);
				continue;
			}
			System.out.println("i = " + i);
			
		}
	}
}