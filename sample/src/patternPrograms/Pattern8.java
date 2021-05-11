package patternPrograms;
/*1
121
12321
1234321
123454321
12345654321
1234567654321*/
public class Pattern8 {
	public static void main(String[] args) {
		String str = "";
		
		for (int i = 1; i <= 7; i++) {
			String temp = "";
			for (int j = 1; j <= i; j++) {
				temp += j +"";
				str += j +"";
			}
			
			if(i > 1) {
				StringBuffer sb = new StringBuffer(temp);
				str += sb.reverse().substring(1).toString();
				
			}
			str += "\r";
		}
		
		System.out.println(str);



	}

}
