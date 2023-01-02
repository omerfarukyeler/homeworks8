package homeworks8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question7 {

	public static void main(String[] args) {
		
		//size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.

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
		
		System.out.println(harf.size());

	}

}
