class Calculator
{
    public int add(int n1, int n2)
    {
        int l = n1+n2;
        return l;
    }
}
public class Class_object {
    public static void main(Demo[] args)
    {
        int num1 = 4;
        int num2 = 7;
         
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
    
}
