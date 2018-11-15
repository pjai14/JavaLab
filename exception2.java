public class exception2
{  
  public static void main(String args[])
{  
   try
{  
       String s="abc";  
int i=Integer.parseInt(s);
   }
catch(NumberFormatException e)
{
System.out.println(e);
}  
    
   System.out.println("this is number format exception");  
  }  
}  
