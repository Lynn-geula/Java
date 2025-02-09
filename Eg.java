class Mobile {
  
         
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name );
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name );
    }

}
 
 
 
 
 public class Eg {
    public static void main(String[] args) 
    {
          
        Mobile obj1 = new Mobile();
      obj1.brand = "Apple";
      obj1.price = 2000;
      Mobile.name = "SmartPhone";

      Mobile obj2 = new Mobile();
      obj2.brand = "Nokia";
      obj2.price = 2590;
      Mobile.name = "Android";
      
      Mobile.name= "Phone";  


      obj1.show();
      obj2.show();

      Mobile.show1(obj1);

    }
    
}
