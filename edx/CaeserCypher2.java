package edx;

public class CaeserCypher2 {
 public static void main(String[] args) {
String cipherChar = cipher("BC ",1);
System.out.println(cipherChar);
//System.out.print((int)cipherChar);
  }
public static String cipher(String plainText, int shift){
int shift2 = shift;
String cipherText = "";
  if (shift > 26){
    shift %= 26;
  }else if(shift < 0){
    shift = (shift % 26) + 26;
  }
  for(int x = 0; x < plainText.length(); x++){
  char [] charArray ;
    char ch = plainText.charAt(x);
 int chInt = (int)(ch);
  shift = shift + chInt;
 char charCipherText = (char)(shift);
 
//   cipherText = new String(charArray);
  }
  /*
  char ch2 = plainText.charAt(1);
 int chInt2 = (int)(ch2);
  shift2 = shift2 + chInt2;
  
 char charCipherText2 = (char)(shift2);
  char [] charArray = {charCipherText, charCipherText2
  };
  cipherText = new String(charArray);  
  */
  return cipherText;
  }
}
