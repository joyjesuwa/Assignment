package Super_Keyword;
class Student
 {    public Student(String name)
        {    System.out.println ("super "+name);
        }
        }
class Exam extends Student
{    public Exam (int score)
{    super ("JOY JESUWA");
    System.out.println ("sub "+score);
}
}


public class Sup {
    public static void main(String[] args)
    {
        Exam e =  new Exam(90);

    }
}
