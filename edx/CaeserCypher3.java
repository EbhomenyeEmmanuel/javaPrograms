package edx;

public class CaeserCypher3 {
final static String COMPARE_WITH = "abcdefghijklmnopqrstuvwxyz";

  public static void main(String[] args) {
String z = normalizeText("This is some \"really\" great. (Text)!?");
		System.out.println("Normalized text is " + z);
		
	String cipherText = cipher("ABCDEF", -1);
System.out.println("CipherText is " + cipherText );
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
  
 public static String cipher(String plainText, int shift){
char[] key = {
  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
};
StringBuilder sb = new StringBuilder();
int shiftedValue = 0;
int storedKeyValue;
char [] charArray = plainText.toCharArray();
for(char ch: charArray){
  for(int i = 0; i< key.length; i++){
    if(Character.toUpperCase(ch) == key[i]){
    storedKeyValue = i;
      if (shift >= 26){
    shift = shift % 26;
    shiftedValue = storedKeyValue + shift;
  }else if(shift < 0){
    shiftedValue = (27 - (-1-shift));
  }
  else
    shiftedValue = storedKeyValue + shift;
  }
 }
  if(shiftedValue >= 26 ){
  shiftedValue -= 26;
    sb.append(key[shiftedValue]);
  }else
  sb.append(key[shiftedValue]);
}  
 String cipherText = (sb.toString());
 return cipherText;
 }
}
