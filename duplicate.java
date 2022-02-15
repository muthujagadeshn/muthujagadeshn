package week1.day1;

public class duplicate {
	public static void main(String[] args) {
		int arra[]=new int[] {14,12,13,11,15,14,15,17,18};
		for (int j= 0; j < arra.length; j++) {
			int count=1;
			for (int k = j+1; k < arra.length; k++) {
	
				if(arra[j]==arra[k]) {
		 
						count++;
					
			
					

}						
					}

					if(count>1) {
						System.out.println(arra[j]);
			}
		}
	}
}