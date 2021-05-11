package practicePrograms;

public class MultipleHundered {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		 double roundup=((Math.ceil(number / 100)) * 100)+100;
		   System.out.println(roundup);
		   
	}

}
