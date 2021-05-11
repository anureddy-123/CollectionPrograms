package practicePrograms;

public class PalindromeOfNum {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int length = String.valueOf(number).length();
		if(length == 3) {
			int rem,quo;
			rem = number % 10;
			quo = number / 100;
			System.out.println(" Palindrom  "+ (rem == quo));
		}
		else {
			System.out.println("false");
		}
	}
}
