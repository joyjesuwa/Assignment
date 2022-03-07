package Abstract_Class;

abstract class A
{    public void show()
{    System.out.println ("class a is  super class");
}
    abstract void display(int x);
}
class B extends A
{    public void show()
{    super.show();
    System.out .println ("class b is sub class");
}
    void display(int x)
    {    System.out.println(" x is in sub class "+x);
    }
}
public class AbstClass {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.display(3);
    }
}
