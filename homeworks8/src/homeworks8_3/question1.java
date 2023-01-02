package homeworks8_3;

public class question1 {

	public static void main(String[] args) {
	//Bir integer array olusturunuz ve bu array’deki 
	//	tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		int[] arr =   {1,2,3,4,5,6} ;
		
		int carpim =1;
		
		
		
		for(int x:arr) {
			
			carpim =carpim*x;
			
		}
		
		System.out.println(carpim);
		
		//carpim=1;
		
		//for(int i =0;i<arr.length;i++) {
			
			//carpim =carpim*arr[i];
			
			
			
		}
		//System.out.println(carpim);
			
		}
		

	

