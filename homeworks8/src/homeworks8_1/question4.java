package homeworks8_1;

public class question4 {

	public static void main(String[] args) {
   // Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini 
   //birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir program yaziniz.
   //	Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,9,13}

		
		
		int[][] arr5 = {{1,2,3},{4,5,6},{7,8,9}};
		
		int i = arr5[0][0]+arr5[0][1]+arr5[0][2];
		
		int j =arr5[1][0]+arr5[1][1]+arr5[1][2];
		
		int k =arr5[2][0]+arr5[2][1]+arr5[2][2];
		
		System.out.print(i+"\t");
		System.out.print(j+"\t");
		System.out.print(k);
		}
	}
//		int rakamtoplam = 0;
		
//		int[x] sonarr ;
//		
//		for (int x=0;x<arr5.length;x++) {
//			
//			int toplam = 0 ; 
//			
//			for(int y =0 ; y<arr5[x].length;y++) {
//				
//				rakamtoplam +=arr5[x][y];
//				
//				rakamtoplam =  sonarr;//arastır 
//			}
//			
//			System.out.println(rakamtoplam);
//			

