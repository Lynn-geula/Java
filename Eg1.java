class Mobile{
    String brand;
    int price;
    static String name;

    static
    {
       name = "Phone";
       System.out.println("in static");
       
    }
}




public class Eg1 {
    public static void main(String[] args)  throws ClassNotFoundException
    {
        Class.forName(Mobile);
    }
    
}
