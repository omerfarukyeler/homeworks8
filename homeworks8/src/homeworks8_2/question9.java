package homeworks8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question9 {

	public static void main(String[] args) {
		//isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz.
		
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
		
		System.out.println(harf.isEmpty());

	}

}
