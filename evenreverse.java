package week1.day1;


public class evenreverse {
	public static void main(String[] args) {
		String name="i am muthu jagadesh";
		String[] word = name.split(" ");
		for (int i = 0; i < word.length; i++) {
			if(i%2==1) {
				
				for (int j = word[i].length()-1; j >=0; j--) {
					System.out.print(word[i].charAt(j));
					
				}
				System.out.print(" ");
			}
			
			else{
				System.out.print(word[i]+" ");
			}
			
		}
		
		
			
		
	}


}

