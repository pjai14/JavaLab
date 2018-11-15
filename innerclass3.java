public class innerclass3 {
   static class Nested_Demo {
      public void my_method() {
         System.out.println("This is my nested class");
      }
   }
   
   public static void main(String args[]) {
      innerclass3.Nested_Demo nested = new innerclass3.Nested_Demo();	 
      nested.my_method();
   }
}
