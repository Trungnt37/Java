package Chap01.Basic;

/* Chuyen doi kieu du lieu
 * TH1: Kieu co kich thuoc nho -> Kieu co kich thuoc lon (khong lam mat thong tin)
 * TH2: Kieu co kich thuoc lon -> Kieu co kich thuoc nho (lam mat thong tin)
 */

public class p05_chuyendoikieudulieu {
	public static void main(String[] args) {
		int var1 = 12;
		double var2 = 1.23;
		int var3 = var1 + (int)var2; 		// Su thu nho
		double var4 = (double)var1 + var2; 	// Su noi rong
		
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
	}
}
