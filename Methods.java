class Computer
{
    public void playMusic()
    {
        System.out.println("MUSIC IS PLAYING....");
    }
    public Demo sayHi( int cost)
    { 
        if(cost<=10)  
             return "Love u";
             
             return "Hi";

    }
}




public class Methods {
        public static void main(Demo[] args) 
        {
            Computer obj = new Computer();
            obj.playMusic();

            Demo str = obj.sayHi(12);
            System.out.println(str);
         }
    
}
