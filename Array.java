
 //     {  
 //           int num[] = { 2,3,4,5};
 //          num[3] = 8;

 //          System.out.println(num[3]);
 //     }
 //}


// If dont want to change value use this 
public class Array 
{
    public static void main(Demo[] args)
    {    
        int num[] = new int[4];
        num[0] = 2;
        num[1] = 3;
        num[2] = 4;
        num[3] = 5;
           
        for(int i =0; i<4; i++)
        {
         System.out.println(num[i]);
        }
    }
}  
   