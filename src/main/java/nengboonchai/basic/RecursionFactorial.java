package nengboonchai.basic;

public class RecursionFactorial {
    static int factorial(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));    
       }    
       public static void main(String args[]){  
        int i,fact=0;  
        int number=5;//It is the number to calculate factorial    
        fact = factorial(number);   
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  
}
