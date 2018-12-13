package edx;
import java.util.ArrayList;
public class MaxLength {

  public static String main(String[] args) {
 ArrayList<String> str = new ArrayList<String>();
         str.add("A");
          str.add("AB");
           str.add("ABC");
            str.add("ABCD");
             str.add("ABCDE");
        int lengthOfLongestString = 0;
        for (int i = 1; i < str.size(); i++) {
        if (str.get(lengthOfLongestString).length() < str.get(i).length()){
          lengthOfLongestString = i;
          }
            
        }
        System.out.println("The longest string in the list is " + str.get(lengthOfLongestString));    
        String longestString = str.get(lengthOfLongestString);
       return longestString;

  }

}
