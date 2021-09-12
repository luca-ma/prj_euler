package util;

public class Util {

	
	public static boolean isPalindrome(long num) {
		
		StringBuilder strNum = new StringBuilder(String.valueOf(num));
		return strNum.toString().equals(strNum.reverse().toString());
	}
}
