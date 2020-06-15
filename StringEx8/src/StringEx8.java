import java.util.Scanner;

public class StringEx8 {
	public static String firstLastDel(String str){
		String cutString = str.substring(1, str.length() - 1);
		
		return cutString;
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String inputStr;
		
		System.out.println("Enter a string: ");
		inputStr = input.nextLine();
		
		System.out.println(firstLastDel(inputStr));
		
		input.close();
	}
}
