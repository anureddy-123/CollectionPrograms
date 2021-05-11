package patternPrograms;
/*1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 
1 0 1 0 1 0 
1 0 1 0 1 0 1*/ 
     public class Pattern1 {
    	 
		public static void main(String[] args) {
			String str = "";
			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= i; j++) {
					
					if(j % 2 == 0) {
						str += "0 ";
					}
					else {
						str += "1 ";
					}				
					
				}
				str += "\r";
			}
			
			System.out.println(str);


		}


}
