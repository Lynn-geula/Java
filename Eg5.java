class human
{
    private int age;
    private String name;
  
//Constructor (It is a method)
    
    public human()                              // Default Constructor 
    {
        age = 12;
        name = "Geula";
    }  

    public human(int age , String name)        // Parameterized Constructor
    {
       this.age = age;
       this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
          this.age = age;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Eg5 {
    public static void main(String[] args) 
    {
        human obj = new human();
        human obj1 = new human(8,"Ashwin");
        // obj.setAge(19);
        // obj.setName("Lynnea");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
    
}