package homeworks8_3;

public class question4 {

	public static void main(String[] args) {
		//Bir String olusturunuz, bu String’deki character’leri 
		//for-each loop kullanarak yazdiriniz. ipucu: split()
		
		String test1 = "bugun    gunlerden                  cumartesi";
		
		test1=test1.replaceAll(" ", "");//tek bosluga cevirdim
		
		System.out.println(test1);
		
		String[] test2 =test1.split("");
		
		for (String test3 : test2) {

			
			System.out.print(test3+",");
		}
	}

	
	
	


	}


