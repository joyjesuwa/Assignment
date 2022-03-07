package Polymorphism_overloading;

class A
{    public void poly1(int x)
{    System.out.println("The value : " + x);
}
}
class b {
    public void poly1(int x, int y) {

        System.out.println("The value : " + x + " and " + y);
    }
}

public class Polym {
    public static void main(String[] args)
    {
        A obj=new A();
        b obj1=new b();
        obj.poly1(10000);
        obj1.poly1(10,25);    }
}
