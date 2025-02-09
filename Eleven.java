public class Eleven {
    //Square root of a number 
    public static void main(String[] args) {
        // double sq=Math.sqrt(25);
        // System.out.println(sq);

        int num = 36;
        double temp;
        double sq = num/2;

        do{
            temp = sq;
            sq = (temp+(num/temp))/2;
        }
        while((temp-sq)!=0);
        {
          System.out.println("The square root of the number is : " + sq);
        }


    }
    
}
