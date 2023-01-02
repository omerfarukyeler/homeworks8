package homeworks8_2;

import java.util.ArrayList;
import java.util.List;

public class question3 {

	public static void main(String[] args) {
		//set() methodu kullanarak, E’yi D yapiniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.

		List<String> harf = new ArrayList<>();
		
		harf.add("A");
		harf.add("C");
		harf.add("E");
		harf.add("F");
		harf.add("B");
		harf.add(1,"L");
		harf.set(3, "D");
		
	
		
		System.out.println(harf);
	}

}
