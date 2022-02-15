package youtube.day1;

public class palindrome {
public static void main(String[] args) {
	String name="madam";
	String store="";
	for (int i = name.length()-1; i >= 0; i--) {
		store=store+name.charAt(i);
		System.out.println(name.charAt(i));
		System.out.println(store);
		
	}
	System.out.println(store);
	
}
}
