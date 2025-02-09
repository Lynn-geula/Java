class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public double add(double n3, int n4)
    {
        return n3+n4;
    }
}




public class Overloading {
    public static void main(String[] args) 
    {
        Calculator cal = new Calculator();
         int r1= cal.add(3,4);
         System.out.println(r1);

    }
    
}
