import java.util.Scanner;
//Find last digit in a number
public class Three {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int num =  input.nextInt();
        if(num>=0)
        {
            num=num%10;
            System.out.println("The last digit is: " + num);
        }
        if (num<0) 
        {
            num=num%10;
            System.out.println("The last digit is " + (num*(-1)));
        }
    }
    
}
