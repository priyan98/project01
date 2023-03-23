package programs;

import java.util.ArrayList;
import java.util.List;

public class SpecialChar {

	public static void main(String[] args) {
		int count = 0;
		String s = "!#$GeeeksforGeeks.Computer@.Science.@Portal!!";
		char[] str = s.toCharArray();
		List<Character>list=new ArrayList<Character>();
		for (int i = 0; i < str.length; i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				list.add(str[i]);
				count++;
			}
		}
		if (count == 0)
			System.out.println("No Special Characters found.");
		else
			System.out.println("String has Special Characters\n" + count + " " + "Special Characters found.");
		for (char c : list) {
			System.out.print(c);
		}
	}

}
