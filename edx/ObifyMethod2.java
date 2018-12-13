package edx;

class ObifyMethod2 {

  public static void main(String[] args) {
AddingStrings("ZIpu");
  }

public static void AddingStrings (String word){
	String vowels = "AEIOUY";
        word = word.toUpperCase();
        String newString = "";
       
 for (int i = 0; i < word.length(); i++){
    for(int j=0; j<vowels.length(); j++){
               
  if(word.charAt(i) == vowels.charAt(j)){
        newString = newString + "OB";
                  break;
          }
      }
        newString += word.charAt(i);  
        }
       
	   System.out.println(newString);
	
    }
}
