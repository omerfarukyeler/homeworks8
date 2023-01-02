package homeworks8_1;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		//Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle = scan.nextLine();
		
		int sayac = 1;
		
		for(int i =0;i<cumle.length();i++) {
			
			if(cumle.charAt(i)==' ') {
				
				sayac++;
			}
		}
		System.out.println("Girilen cumlede "+sayac+" tane kelime vardir");
	}

}
