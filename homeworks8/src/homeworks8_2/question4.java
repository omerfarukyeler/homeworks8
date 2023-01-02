package homeworks8_2;

import java.util.ArrayList;
import java.util.List;

public class question4 {

	public static void main(String[] args) {
		//remove() methodu kullanarak, F’yi siliniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.

		List<String> harf = new ArrayList<>();
		
		harf.add("A");
		harf.add("C");
		harf.add("E");
		harf.add("F");
		harf.add("B");
		harf.add(1,"L");
		harf.set(3, "D");
		harf.remove("F");
		
		System.out.println(harf);

	}

}
