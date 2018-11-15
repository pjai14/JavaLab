package com.tutorialspoint;

import java.util.*;

public class exception4 {
   public static void main(String[] args) {

      String s = "Hello World! 3 + 3.0 = 6 ";

      
      Scanner scanner = new Scanner(s);

      
      System.out.println("" + scanner.nextLine());

      
      System.out.println("" + scanner.ioException());

      
      scanner.close();
   }
}
