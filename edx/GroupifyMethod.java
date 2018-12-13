package edx;

class GroupifyMethod {

  public static void main(String[] args) {
String z = groupify("Emmanuel", 5);
System.out.println("Groupified text is " + z);
  }
public static String groupify(String word, int groupifyValue) throws IllegalArgumentException {
		if (groupifyValue <= 0)
			throw new IllegalArgumentException("padding must be greater than 0"); 
		StringBuilder sb = new StringBuilder();
		StringBuilder tempHolder = new StringBuilder();
		// use this 'counter' variable to know when to put padding spaces
		int counter = 1;	
		if ( (word.length() % groupifyValue) == 0 ) {
			for (int i = 0; i < word.length(); i++) { 
				if ((counter % groupifyValue) == 0)				
					sb.append(word.charAt(i) + " ");
				else
					sb.append(word.charAt(i));
				counter++;
			}
		}else {
		  for (int i = 0; i < word.length(); i++) { 
				if ((counter % groupifyValue) == 0)				
					sb.append(word.charAt(i) + " ");
				else
					sb.append(word.charAt(i));
				counter++;
			}
			for(; ;){
			if (word.length() % groupifyValue == 0){
			  break;
           }else{
            sb.append("x");
            word += " ";
           }
			  
       }
}
		String str = sb.toString();
		return str;
    }
}
