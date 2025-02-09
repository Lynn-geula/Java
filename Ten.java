import java.util.Scanner;
public class Ten {
    //Palindrome or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=input.nextInt();
        int org=num;
        int rev = 0;
        while(num!=0)
        {
            rev = rev*10 + num%10;
            num=num/10;
        }
        if(rev==org)
        {
            System.out.println("The given number is a PALINDROME");
        }
        else{
            System.out.println("The given number is NOT A PALINDROME ");
        }
        
    }
    
}
