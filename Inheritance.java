class Animal
{
    int noLegs = 4;
    
    public void eat()
    {
        System.out.println("I can Eat");
    }

    public void walk()
    {
        System.out.println("I can Walk");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("I can bark");
    }

    Boolean canBark = true;
}




public class Inheritance {
    public static void main(String[] args) { 

        Dog obj = new Dog();
        System.out.println(obj.noLegs);
        obj.bark();
        obj.eat();
        obj.walk();

        
    }
    
}
