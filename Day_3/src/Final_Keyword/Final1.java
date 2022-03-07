package Final_Keyword;

final class A
{    public void show()
{    System.out.println ("A Class");
}
}
//class B extends A  // Error...Final class can't be inherited.
class B   // correct
{    public void show()
{    System.out.println ("B Class");
}
}
public class Final1 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.show();
        b.show();
    }
}
