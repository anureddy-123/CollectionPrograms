package practicePrograms;

public class SignFinder {
	public static void main(String[] args) {
		try{
			int number=Integer.parseInt(args[0]);
			if(number>0){
				System.out.println("Positive value");
			}
			if(number<0){
				System.out.println("Negetive value");
			}
			if(number==0){
				System.out.println("Zero");
			}
		}
		catch(NumberFormatException e){
			System.out.println("error");
		}
	}


}
