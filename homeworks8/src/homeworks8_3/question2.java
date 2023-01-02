package homeworks8_3;

public class question2 {

	public static void main(String[] args) {
		//Bir integer list olusturunuz ve bu list’deki 
		//tum sayilarin karesinin toplamini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.


		
		int[] arr2 =   {1,2,3,4,5,6} ;
 
		
		int karetoplam =0;
		
		for(int x:arr2) {
			
			karetoplam += x*x;
		}
		
		System.out.println(karetoplam);
	}

}
