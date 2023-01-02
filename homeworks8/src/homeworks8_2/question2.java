package homeworks8_2;

import java.util.ArrayList;
import java.util.List;

public class question2 {

	public static void main(String[] args) {
		//indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
		//index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
		//ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.

		
		List<String> harf = new ArrayList<>();
		
		harf.add("A");
		harf.add("C");
		harf.add("E");
		harf.add("F");
		harf.add("B");
		harf.add(1,"L");
		
		
		System.out.println(harf);

	
	}

}
