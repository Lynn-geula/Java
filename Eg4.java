class human
{
    private int age;
    private String name;
  
//Constructor (It is a method)
    
    public human()
    {
        age = 12;
        name = "Geula";
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


public class Eg4 {
    public static void main(String[] args) 
    {
        human obj = new human();
        // obj.setAge(19);
        // obj.setName("Lynnea");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
    
}






