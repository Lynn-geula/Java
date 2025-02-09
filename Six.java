public class Six {
    public static void main(String[] args) {
        // GCD / HCF (GREATEST COMMON DIVISOR ) / (HIGHEST COMMON FACTOR)
        int a =98 , b= 56;
        
         while(a!=b)
         {
            if(a==0)
            {
                System.out.println("Gcd : " + b);
                break;
            }
            else if(b==0)
            {
                System.out.println("Gcd : " + a);
                break;
            }
            else if(a>b)
            {
                a = a-b;
            }
            else if(b>a)
            {
                b = b-a;
            }
         }
        if(a==b)
        {
            System.out.println("Hcf : " + a);
        }
    }
    
}
