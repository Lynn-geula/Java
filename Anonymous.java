class A 
{
     public A()
     {
        System.out.println("Object CREATED");
     }

     public void show()
     {
        System.out.println("this is a method");
     }
}



public class Anonymous {
    public static void main(String[] args) {
        
          new A().show();                     // Anonymous Object 
    }
    
}
