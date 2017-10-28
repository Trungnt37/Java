package Chap01.Basic;

/*
 * Vong lap for
 * Vong lap while
 * Vong lap do...while
 */
public class p09_vonglap {
	public static void main(String[] args) {
		int number = 1;
		// Vong lap for
		
		for(int i = 1; i <= 10; i++){
			System.out.println("Java is not difficult!");
		}
		
		// vong lap while
		while(number <= 10){
			System.out.println("Java is difficult!");
			number = number + 2;
		}
		
		
		// vong lap do while
		int k = 1;
		do{
			System.out.println("Hello wold!");
			k +=1;
		} while (k <= 5);
	}
}
