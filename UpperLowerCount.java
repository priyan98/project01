package programs;

import java.util.Iterator;

public class UpperLowerCount {
	public static void main(String[] args) {
		String str = "WelCome To ThE JunGlE";
		int lower = 0;
		int upper = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;
			} else {
				lower++;
			}
		}
System.out.println("Count of Upper: "+upper);
System.out.println("Count of Lower: "+lower);
	}

}
