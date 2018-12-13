/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOOPS;

/**
 *
 * @author DELL INSPIRON
 */
public class Pattern4 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
   for (int col = 1; col <= 5; col++) {
       int count =1;
       count++;
      if (row == col) {
         System.out.print("1");
      } else {
         System.out.print(" ");
      }
       if (row == col) {
         System.out.print("2");
       }
      
   }
   System.out.println();
}
    }
    
}
