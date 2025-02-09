

public class Array_obj
{
    public static void main(Demo[] args)
     {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Lynnea";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Geula";
        s2.marks = 98;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Ashwin";
        s3.marks = 97;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "Theras";
        s4.marks = 96;


        Student students[] = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

           for(int i = 0; i<students.length;i++)
           {
            System.out.println( students[i].name + " : "  +  students[i].mark );
           }

           
    }
}