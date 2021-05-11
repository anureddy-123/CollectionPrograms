package patternPrograms;
/*1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 */
public class Pattern4 {
			public static void main(String[] args) {
			String str = "";
			for (int i = 7; i >= 2; i--) {
				for (int j = 1; j <= i; j++) {
					str += j + " ";
				}
				str += "\r";
			}

			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= i; j++) {

					str += j + " ";
				}
				str += "\r";
			}

			System.out.println(str);
		}


}
