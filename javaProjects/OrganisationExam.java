package javaProjects;
import java.util.Random;
import java.util.Scanner;
public class OrganisationExam {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    Random rand = new Random();
  
    String firstQuestion = "Who is the president of Nigeria?";
    String secondQuestion = "When does Nigeria celebrate her independence?";
    String thirdQuestion = "Nigeria was amalgamated in what year?"; 
               
    int randNoOfQuestions = 1 + rand.nextInt(3);
        //System.out.println("Random num is " + randNoOfQuestions);
        int noOfCorrectAnswers = 0;
        int marks = 0;
        if (randNoOfQuestions == 1) {
            //The questions would appear 1 - 2 - 3
        //The  value of the randNoOfQuestions is 1
            System.out.println( firstQuestion);              
             System.out.println("(A)                \t(B)                  \t(C)                     \t(D)");
        System.out.println("Muhammadu Buhari \t David Saraki \t Goodluck Ebele Jonathan \t Odunlade Adekola");
        String userInput1 = input.next();
        userInput1 = userInput1.toUpperCase();
            if (userInput1.matches("A")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
            }else{
            System.out.println("You are wrong");
                if ( marks >= 1) {
               marks = --noOfCorrectAnswers;
                }else {
                 marks = 0;
                } 
            }
            System.out.println(secondQuestion);
            System.out.println("(A)     \t (B)      \t (C)      \t(D)");
            System.out.println("1947    \t 1987     \t 2018     \t 1960");
     String userInput2 = input.next();
     userInput2 = userInput2.toUpperCase();
      if (userInput2.matches("D")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
        }else{
            System.out.println("You are wrong");
              if ( marks >= 1) {
             marks = --noOfCorrectAnswers;
            }else {
                 marks = 0;
            } 
        }
             
            System.out.println(thirdQuestion);
        System.out.println("(A)   \t(B)    \t(C)  \t(D)");
            System.out.println("1945   \t1914   \t1827  \t1682");
        String userInput3 = input.next();
        userInput3 = userInput3.toUpperCase();
        if (userInput3.matches("B")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
        }else{
            System.out.println("You are wrong");
            if ( marks >= 1) {
               marks = --noOfCorrectAnswers;
            }else {
                 marks = 0;
            } 
        }
   
    }else if(randNoOfQuestions == 2){
        //The questions would appear 2 - 1 - 3
        //The value of randNoOfQuestions is 2
        System.out.println(secondQuestion);
        System.out.println("(A)     \t (B)      \t (C)      \t(D)");
        System.out.println("1947    \t 1987     \t 2018     \t 1960");
        String userInput2 = input.next();
        userInput2 = userInput2.toUpperCase();
        if (userInput2.matches("D")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
        }else{
            System.out.println("You are wrong");
            if ( marks >= 1) {
               marks = --noOfCorrectAnswers;
            }else {
                 marks = 0;
            } 
        }
      
        System.out.println( firstQuestion);              
             System.out.println("(A)                \t(B)                  \t(C)                     \t(D)");
        System.out.println("Muhammadu Buhari \t David Saraki \t Goodluck Ebele Jonathan \t Odunlade Adekola");
        String userInput1 = input.next();
        userInput1 = userInput1.toUpperCase();
            if (userInput1.matches("A")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
            }else{
            System.out.println("You are wrong");
                if ( marks >= 1) {
                marks = --noOfCorrectAnswers;
                }else {
                 marks = 0;
                } 
            }

        System.out.println(thirdQuestion);
        System.out.println("(A)   \t(B)    \t(C)  \t(D)");
            System.out.println("1945   \t1914   \t1827  \t1682");
        String userInput3 = input.next();
        userInput3 = userInput3.toUpperCase();
        if (userInput3.matches("B")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
        }else{
            System.out.println("You are wrong");
            if ( marks >= 1) {
               marks = --noOfCorrectAnswers;
            }else {
                 marks = 0;
            } 
        }
    }else{
        //The questions would appear 3 - 2 - 1
        //The randNoOfQuestions is 3
            System.out.println(thirdQuestion);
        System.out.println("(A)   \t(B)    \t(C)  \t(D)");
            System.out.println("1945   \t1914   \t1827  \t1682");
        String userInput3 = input.next();
        userInput3 = userInput3.toUpperCase();
        if (userInput3.matches("B")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
        }else{
            System.out.println("You are wrong");
            if ( marks >= 1) {
               marks = --noOfCorrectAnswers;
            }else {
                 marks = 0;
            } 
        }
        
         System.out.println(secondQuestion);
            System.out.println("(A)     \t (B)      \t (C)      \t(D)");
    System.out.println("1947    \t 1987     \t 2018     \t 1960");
     String userInput2 = input.next();
     userInput2 = userInput2.toUpperCase();
      if (userInput2.matches("D")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
        }else{
            System.out.println("You are wrong");
            if ( marks >= 1) {
               marks = --noOfCorrectAnswers;
            }else {
                 marks = 0;
            } 
        }
      
      System.out.println( firstQuestion);              
             System.out.println("(A)                \t(B)                  \t(C)                     \t(D)");
        System.out.println("Muhammadu Buhari \t David Saraki \t Goodluck Ebele Jonathan \t Odunlade Adekola");
        String userInput1 = input.next();
        userInput1 = userInput1.toUpperCase();
            if (userInput1.matches("A")) {
            System.out.println("You are correct");
            ++noOfCorrectAnswers;
            marks = noOfCorrectAnswers;
            }else{
            System.out.println("You are wrong");
                if ( marks >= 1) {
               marks = --noOfCorrectAnswers;
                }else {
                 marks = 0;
                } 
            }
        
        }
        System.out.println("You got " + noOfCorrectAnswers + " questions correctly");
        System.out.println("You scored " + marks + " marks ");
    }
}
