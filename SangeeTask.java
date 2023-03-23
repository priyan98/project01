package programs;

public class SangeeTask {
	
	public static void main(String[] args) {
		String str = "sangee123priyan123";

		System.out.println(SangeeTask.reverseOnlyLetters(str));
	}
	 public static String reverseOnlyLetters(String S) {
	        StringBuilder sb = new StringBuilder(S);
	        for (int i = 0, j = S.length() - 1; i < j;) {
	            if (!Character.isLetter(sb.charAt(i))) {
	                ++i;
	            } else if (!Character.isLetter(sb.charAt(j))) {
	                --j;
	            } else {
	                sb.setCharAt(i, S.charAt(j));
	                sb.setCharAt(j--, S.charAt(i++));
	            }
	        }
	        return sb.toString();
	    }
}
