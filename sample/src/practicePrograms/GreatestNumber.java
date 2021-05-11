package practicePrograms;

public class GreatestNumber {
	public static void main(String[] args) {
		try{
		int number=Integer.parseInt(args[0]);
		int  number1 = Integer.parseInt(args[1]);
		if (number > number1) {
			System.out.println(number+ " Is big");
		}
		else if(number > number1) {
			System.out.println(number1+ " Is big");
		}
		else {
			System.out.println("Both Are Same");
		}

		}
			catch(NumberFormatException e){
				System.out.println("error");
			}
		}

}
