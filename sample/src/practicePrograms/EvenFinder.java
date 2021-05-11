package practicePrograms;

public class EvenFinder {
	public static void main(String[] args) {
		try {
		int number = Integer.parseInt(args[0]);
		String evenOdd;
			 evenOdd = (number % 2 == 0) ? "True" : "False";
			 System.out.println(evenOdd);
		}
		catch (NumberFormatException e) {
			System.out.println(e+"error");
		}
	}

}
