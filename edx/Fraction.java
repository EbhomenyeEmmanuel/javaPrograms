package edx;

import edx.Fraction;

public class Fraction {
private int numerator ;
private int denominator ;

public Fraction (int num, int denom){
  if(denom == 0 ){
    throw new IllegalArgumentException("Denominator should not be 0");
  }else if ( denom < 0 || (num < 0 && denom < 0) ){
    if(denom < 0){
      num *= -1  ;
    }else{
      num *= -1;
      denom *= -1;
    }
  }
    numerator = num;
    denominator = denom;
    
 }
 
 public Fraction (int num){
   numerator = num;
   denominator = 1;
 }
 public Fraction (){
   this.numerator = 0;
   this.denominator = 1;
 }
 
 public int getNumerator(){
   return numerator;
 }
  
 public int getDenominator(){
   return denominator;
 }
 
 public String toString(){
   return String.format("%d/%d", numerator, denominator );
 }
 /*
 
 public double toDouble(){
   return (double )(numerator / denominator);
 }
// Fraction myFrac = new Fraction ();
 
 public Fraction add(Fraction other){
   return this.myFrac + other;
 }
 
  public Fraction subtract(Fraction other){
   return this.myFrac - other;
 }
 
  public Fraction multiply(Fraction other){
   return this.myFrac * other;
 }
 
  public Fraction divide(Fraction other){
  if (other.getDenominator() == 0){
    throw new IllegalArgumentException("You cannot divide by zero :(");
  }else{
    return this.myFrac / other;
  }   
 }
 
 */
  public boolean equals(Object obj){
 //Check if the instances are pointing to themselves 
   if (this == obj){
     return true;
   }
  if (obj == null){
     return false;
   }
   //Make sure the two instances are from the same class
  if(!(obj instanceof Fraction)){
  return false;
  }
  //Cast to make the fields of the instances comparable 
   Fraction frac = (Fraction) obj;
     if((frac.numerator == this.numerator) && (frac.denominator == this.denominator))
     return true;
     else {
       return false ;
     }
 }
 
 //Override hashCode since equals method was overrided
 public int hashCode(){
   int hash = 7;
   hash = 31 * hash + this.numerator;
   hash = 31 * hash + this.denominator;
   return hash;
 }
 
 public void toLowestTerm(){
 //Reduce numerator to lowest term
 int a = numerator;
 int b = denominator;

 }
 
 
 public static int gcd(int num, int denom){
   int a = num;
 int b = denom;

 while (a != 0 || b != 0){ 
   int rem = a % b;
   a = b;
   b = rem;
  if (a == 0){
     break;
   }else if(b == 0){
     break;
      }
    
    } 
    if (a == 0){
     return b;
   }else if(b == 0){
     return a;
      }else{
        return 0;
      }
 }
 

}
