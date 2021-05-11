package practicePrograms;

public class EvenOrOdd {
	public static void main(String[] args) {
		try{
			int number=Integer.parseInt(args[0]);
			if(number%2==0){
				System.out.println("even number");
			}
			else{
				System.out.println("odd number");
			}
		}
		catch(NumberFormatException e){
			System.out.println("error");
		}
	}


}
