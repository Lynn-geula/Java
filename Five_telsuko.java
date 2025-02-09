class Mobile {
  
         
        String brand;
        int price;
        static String name;

        public void show()
        {
            System.out.println(brand + " : " + price + " : " + name );
        }

    }
    


public class Five_telsuko
{
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

      
    }
}