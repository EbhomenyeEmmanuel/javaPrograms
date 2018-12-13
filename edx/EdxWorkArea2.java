package edx;

class EdxWorkArea2 {

  public static void main(String[] args) {
groupify("Chukarr", 4);
  }
  public static void groupify(String word, int padding) throws IllegalArgumentException {
		if (padding <= 0)
			throw new IllegalArgumentException("padding must be greater than 0"); 
		StringBuilder sb = new StringBuilder();
		StringBuilder tempHolder = new StringBuilder();
		// use this 'counter' variable to know when to put padding spaces
		int counter = 1;	
		if ( (word.length() % padding) == 0 ) {
			for (int i = 0; i < word.length(); i++) { 
				if ((counter % padding) == 0)				
					sb.append(word.charAt(i) + " ");
				else
					sb.append(word.charAt(i));
				counter++;
			}
		}else {
		  for (int i = 0; i < word.length(); i++) { 
				if ((counter % padding) == 0)					   
	sb.append(word.charAt(i) + " ");
				else					sb.append(word.charAt(i));
				counter++;
			}
			for(; ;){
			if (word.length() % padding == 0){
			  break;
           }else{
            sb.append("x");
            word += " ";
           }
			  
       }
}
		System.out.println(sb);
    }
}
