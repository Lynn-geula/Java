public class Main{
public static void main(String args[])
{
pattern_2(4 );
}
 
 static void pattern_2(int n)
{
  for(int i=1;i<=n;i++)
   {
     for(int j =1;j<=n+1-i;j++)
      {
        System.out.print(" * ");
      }
         System.out.println();
   } 
  
}
}


