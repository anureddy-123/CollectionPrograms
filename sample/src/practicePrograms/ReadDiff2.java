package practicePrograms;

public class ReadDiff2 {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int num1 = num%10;
		int num2 = num/10;
	    System.out.println(Math.abs(num1-num2));
		}

}
