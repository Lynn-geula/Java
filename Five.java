import java.util.Scanner;
 class Five {
    //Find power of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base , exponent;
        double result;
        System.out.println("Enter the base number : ");
        base = sc.nextInt();
        System.out.println("Enter the exponent : ");
        exponent = sc.nextInt();
        result = Math.pow(base, exponent);
        System.out.println("RESULT : " + result);
    }
    
}
