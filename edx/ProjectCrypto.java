package edx;
class ProjectCrypto {
final static String COMPARE_WITH = "abcdefghijklmnopqrstuvwxyz";

  public static void main(String[] args){		
  String normalizedText = normalizeText("This is some \"really\" great. (Text)!?");
		System.out.println("Normalized text is " + normalizedText);
		
		String obifiedText = obify(normalizedText);
System.out.println("Obified Text is " + obifiedText);
  
String cipherText = shiftAlphabet(obifiedText, 1);
System.out.println("CipherText is " + cipherText );

String groupifiedText = groupify(cipherText, 8);
System.out.println("GroupifiedText is " + groupifiedText );

	}
	 
  public static String normalizeText(String text) {
		String textInLowerCase = text.toLowerCase();
		char[] charArray = textInLowerCase.toCharArray();
		String newText = "";
		
	for (int i = 0; i < charArray.length; i++) {
			if (COMPARE_WITH.contains(charArray[i] + "")) {
				newText = newText + charArray[i];
			}
		}
		return newText.toUpperCase();
	}
	
	public static String obify(String normalizedText){ 
 String vowelString = "AEIOUY";
    String obifiedText = "";
    for(int i=0; i < normalizedText.length(); i++){ 
    if (vowelString.contains(normalizedText.charAt(i) + "")){
     obifiedText = obifiedText + "OB" + normalizedText.charAt(i);
      }else{
        obifiedText += normalizedText.charAt(i);
      }
    }
    return obifiedText;
  }
  
    public static String shiftAlphabet(String plainText, int shift) {
  plainText = plainText.toUpperCase();
  char[] key = {
  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
};
   int start = 0;
    if (shift < 0) {
        start = (shift%26) + 26;
    } else {
        start = (shift%26);
    }
   
    String result = "";
    for(int i = 0; i < plainText.length(); i++) { 
    int j = 0;
    /* The for loop below is to find the index of the first string. after finding it, it would then be shifted by the value u like .
    * Here when the inner/nested loop stops, j has a new value (it is no longer zero) . 
    * The new value of j is the value of the index in the string ; 
    */
   char ch = plainText.charAt(i); // find item with first index of String
   int nElems = key.length;
for( ; j<nElems; j++){ 
if(key[j] == ch) {
  break;
}
    }   //This adds the shifted String up because key[(start + j )%26] is the newest version of the inputted String
    result = result + key[(start + j )%26];
    }    
   return result;
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