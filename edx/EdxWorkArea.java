package edx;

public class EdxWorkArea {

  public static void main(String[] args){
String z = shiftAlphabet("Abc", 1);
System.out.println("Normalized text is "+ z);
  }
  public static String shiftAlphabet(String plainText, int shift) {
  plainText = plainText.toUpperCase();
   int start = 0;
    if (shift < 0) {
        start = (shift%26) + 26;
    } else {
        start = (shift%26);
    }
   
    String result = "";
    for(int i = 0; i < plainText.length(); i++) { 
    /*
    */
   // find the character of the first index of String
   char ch = plainText.charAt(i);    
    int chInt = (int)ch;
    result = result + 
    ((char)((start + chInt)%26));
    System.out.println("Result is " + result );
    }    
   return result;
 }

}
