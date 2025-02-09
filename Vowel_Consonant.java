import java.util.Scanner;
class Vowel_Consonant{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a alphabet " );
     char a = sc.next().charAt(0);
     if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'||a=='A'|| a=='E'|| a=='I'||a=='O'||a=='U'){
        System.out.println("The given character is vowel");
        
    }else{
          System.out.println("The given character is consonant");
        
    }

    }
}
