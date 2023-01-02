package homeworks8_1;

public class question2 {

	public static void main(String[] args) {
		
		
	// Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana yazdiran bir program yaziniz.
	//  { {1,2,3}, {4,5}, {6} }

		
		int[][] arr2= { {1,2,3}, {4,5}, {6} };
		
		int sonelemancarpim = 1 ;
		


		
		for (int i=0;i<arr2.length;i++) {
			
			//for (int j=2;j>arr2[j].length;j--) gerek kalmadı
		
				sonelemancarpim = sonelemancarpim *arr2[i][arr2[i].length-1];
			
		}	
		
		System.out.println(sonelemancarpim);
			
		}
	
}
			
		

	


