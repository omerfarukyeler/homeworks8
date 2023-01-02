package homeworks8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question5 {

	public static void main(String[] args) {
		//sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.

				
		List<String> harf = new ArrayList<>();
		
		harf.add("A");
		harf.add("C");
		harf.add("E");
		harf.add("F");
		harf.add("B");
		harf.add(1,"L");
		harf.set(3, "D");
		harf.remove("F");
		Collections.sort(harf);
		
		System.out.println(harf);

	}

}
