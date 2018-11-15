
class Outer {  
   class Inner { 
      public void show() { 
         class extra {
             void innerMethod() { 
                System.out.println("inside innerMethod"); 
   } 
} 
extra e = new extra();
e.innerMethod();
}
}
}

class innerclass { 
   public static void main(String[] args) { 
       Outer.Inner in = new Outer().new Inner();
        in.show(); 
       
   } 
} 

