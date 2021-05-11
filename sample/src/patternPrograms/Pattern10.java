package patternPrograms;
/*1 
2 6 
3 7 7 
4 8 8 8 
5 9 9 9 9 */
public class Pattern10 {
		public static void main(String[] args) {
			String str = "";
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					if (j == 1) {
						str += i + " ";
					} else {
						str += (i + 4) + " ";
					}

				}
				str += "\r";
			}

			System.out.println(str);
		}

}
