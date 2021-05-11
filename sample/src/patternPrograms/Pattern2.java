package patternPrograms;
/*1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 */
public class Pattern2 {
	
    public static void main(String[] args) {
			String str = "";
			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= i; j++) {
					str += j +" ";
				}
				str += "\r";
			}
			
			System.out.println(str);
		}


}
