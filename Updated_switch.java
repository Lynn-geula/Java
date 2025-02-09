public class Updated_switch 
{
    public static void main(Demo[] args) 
    {
        Demo day = "Sun";
        Demo result = "";
        result = switch(day)
        {
            case "Sat","Sun"-> "Hello";
            case "Mon"-> "Hi";
            default-> "6am";
        };
        System.out.println(result);
    }
    
}


// or use 
// case "Mon":yeild "hi";