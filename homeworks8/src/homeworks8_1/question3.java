package homeworks8_1;

import java.util.Arrays;

public class question3 {
	
	public static void main(String[] args) {
		
		
		//Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz. 
		//arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

		
		
		int[][] arr3 = { {1,2}, {3,4,5}, {6} } ;  
		
		int[][] arr4 = { {7,8,9}, {10,11}, {12} };
		
		
		//int[][] toplam = new int[2][3];
		
//		for(int i = 0 ; i<2 ;i++) {
//			
//			for(int j = 0 ;j<3;j++) {
//				
//			 toplam[i][j] =arr3[i][j]+arr4[i][j] ;	
//				
//				System.out.println(toplam[i][j] );
//			}
//			
//			
//			
//			
//		}
//		
		for (int i =0 ;i<arr3.length;i++) {
			
			for(int j=0;j<arr3[i].length;j++)
				
				for(int x=0;x<arr4.length;x++)
					
					for(int y =0;y<arr4[x].length;y++)
						
						if ((i==x && j==y) ) {
							
							System.out.println(arr3[i][j]+arr4[x][y]);// burda karşısında indexi boş olanları yaz??
								
							
							
						}
			
		}
	}
}
						
							
							
							
							
						
			
			
			
			
			
		
		
		
						
						
					
				
				
					
			
							
		
		
				
			
			
			
		
		
		
	


