class HelloWorld 
{ 
    HelloWorld() 
    { 
        System.out.println("Hello World! This is 1st constructor"); 
    } 
} 
  

class HelloIndia extends HelloWorld 
{ 
    HelloIndia() 
    { 
        
        super(); 
  
        System.out.println("Hello India! This is 2nd constructor"); 
    } 
} 
  

class supercons 
{ 
    public static void main(String[] args) 
    { 
        HelloIndia s = new HelloIndia(); 
    } 
} 
