/*@Written by Iyoab Awol
 * 			  July 3rd, 2022
 * This program takes a sentence (String) from a user as an input, and print out the reverse of the 
 * string, taken from the user.
 * */
import java.util.*;
public class StringRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character> store= new Stack<Character>();
		System.out.println("Please, enter a sentence.");
		String sen=sc.nextLine();
		String sent = sen.replaceAll("\\s","");
		for(int i=0; i<sent.length();i++){
			store.push(sent.charAt(i));
		}
		System.out.println(sen);
		//System.out.println(store);
		for (int i=store.size()-1;i>=0;i--) {
			System.out.print(store.get(i));
		}
	
		

	}

}
