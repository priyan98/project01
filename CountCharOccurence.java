package programs;

public class CountCharOccurence {
	
	public static void main(String[] args) {
		
		String str="Java is object oriented language";
		
		int result=str.length()-str.replaceAll("e", "").length();
		System.out.println(result);
	}

}
