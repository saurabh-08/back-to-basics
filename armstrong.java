******Armstrong number by saurabh-08******

import java.lang.Math;

public class MyClass {
    public static void main(String args[]) {
      int num = 153;
      int numClone = num;
      int numClone2 = num;
      int digitCount = 0;
      int isArmstrong = 0;
      int temp = 0;
      
      while(numClone2 > 0) {
        numClone2 = numClone2/10;  
        digitCount++;
      }
      
      while(numClone > 0) {
        temp = temp + (int)Math.pow((numClone%10),digitCount);
        numClone = numClone/10;
      }

      if(temp == num) {
        isArmstrong = 1;
      }
      
      if(isArmstrong == 1) {
        System.out.println("Amrstrong");  
      }
      
      else {
         System.out.println("Not an Amrstrong");
      }
      
    }
}
