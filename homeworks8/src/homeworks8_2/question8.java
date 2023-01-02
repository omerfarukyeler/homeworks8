package homeworks8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question8 {

	public static void main(String[] args) {
		
		//clear() methodu kullanarak, list’deki tum elemanlari siliniz.


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
		harf.clear();
		
		
		System.out.println(harf);
		
	}

}
