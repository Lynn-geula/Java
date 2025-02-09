public class Two {
    // Count digit in a number
    public static void main(String[] args) {
        int n = 638675307;
        int count = 0;
        while (n>0) {
            n=n/10;
            count++;
        }
        System.out.println("The no of digits in the given input is: " + count);
    }
    
}
