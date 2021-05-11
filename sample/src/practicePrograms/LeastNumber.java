package practicePrograms;

public class LeastNumber {
	public static void main(String[] args) {
		try{
		int number=Integer.parseInt(args[0]);
		int  number1 = Integer.parseInt(args[1]);
		if (number < number1) {
			System.out.println(number+ " Is small");
		}
		else if(number < number1) {
			System.out.println(number1+ " Is small");
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
