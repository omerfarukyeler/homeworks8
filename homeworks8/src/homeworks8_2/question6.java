package homeworks8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question6 {

	public static void main(String[] args) {
		
		//contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.
		
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
		
		System.out.println(harf.contains("L"));
		System.out.println(harf.contains("M"));

	}

}
