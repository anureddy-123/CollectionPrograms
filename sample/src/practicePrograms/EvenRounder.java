package practicePrograms;

public class EvenRounder {
	public static void main(String[] args) {
		try{
		int number=Integer.parseInt(args[0]);
		if(number%2==0){
			double roundup=((Math.ceil(number / 10)) * 10)+10;
			   System.out.println(roundup);
			
		}
		else{
			System.out.println(number);
		}
		}
		
		catch(NumberFormatException e){
			System.out.println("error");
		}
	}

}
