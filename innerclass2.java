interface Animal
{
 void type();
}
public class innerclass2 {
 public static void main(String args[])
 {
  Animal an = new Animal(){         
  public void type()
  {
   System.out.println("Annonymous animal");
  }
 };
  an.type();
 }
}
