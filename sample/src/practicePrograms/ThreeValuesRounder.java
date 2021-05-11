package practicePrograms;

public class ThreeValuesRounder {
	public static void main(String[] args) {
		try {

			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			int number3 = Integer.parseInt(args[2]);
			int sum = number1+number2+number3;
			double roundup = ((Math.ceil(sum / 8)) * 10) + 10;
			System.out.println(roundup);

		} catch (NumberFormatException e) {
			System.out.println("Error");
		}
	}

}
