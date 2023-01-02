package homeworks8_1;

public class question1 {

	public static void main(String[] args) {
		//Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
		// { {1,2,3}, {4,5,6} }

		
		int[][] arr =  { {1,2,3}, {4,5,6} };
		
		int satir_carpim ;
		
		for(int i =0;i<arr.length ; i++) {
			
		satir_carpim=1;
			
			for(int j=0;j<arr[0].length;j++) {
				
				satir_carpim *= arr[i][j];
				
			}
			System.out.println(i+1 +". satirin  carpimi "+ satir_carpim);
		}
				
        int sutun_carpim ;
		
        for(int j =0;j<arr[0].length ; j++) {
			
		sutun_carpim=1;
			
			for(int i=0;i<arr.length;i++) {
				
				sutun_carpim *= arr[i][j];
				

	}
			System.out.println(j+1 +". sutunun  carpimi "+ sutun_carpim);
}
	
}
}