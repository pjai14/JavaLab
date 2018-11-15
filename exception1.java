public class exception1
{  
  public static void main(String args[])
{  
   try
{  
       String s=null;  
System.out.println(s.length());
   }
catch(NullPointerException e)
{
System.out.println(e);
}  
    
   System.out.println("this is null pointer exception");  
  }  
}  
