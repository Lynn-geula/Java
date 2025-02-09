import java.util.Scanner;
public class Nine {
    // Armstrong number or not a armstrong number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int backup = num;
        int sum =0;
        while(num>0)
         {
            sum = sum +(num%10)*(num%10)*(num%10);
            num = num/10;
         }
         if(sum==backup)
         {
            System.out.println("Armstrong Number");
         }
         else{
            System.out.println("Not a Armstrong Number");
         }
    }
    
}
