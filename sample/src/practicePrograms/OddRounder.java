package practicePrograms;

public class OddRounder {
	public static void main(String[] args) {
		try{
		int number=Integer.parseInt(args[0]);
		if(number%2==0){
			System.out.println("enen number");
		}
		else{
		 double roundup=((Math.ceil(number / 10)) * 10)+10;
		   System.out.println(roundup);
		}
		}
		
		catch(NumberFormatException e){
			System.out.println("error");
		}
	}

}
