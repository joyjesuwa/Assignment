package Interfaces;
class A
{    void show()
{    System.out.println ("Iam in class A");
}
} class B extends A
{    void show()
{    System.out.println ("Iam in class B");
}
} interface C
{    public void show1();
}
class D extends B implements C
{    void show()
{    System.out.println ("Iam using Class B in class C");
}public void show1()
{    System.out.println ("Iam using interface class");
}
} class E extends A
{    void show()
{    System.out.println ("Iam in class E");
}
}
public class MultipathInheritance {
    public static void main(String[] args) {
        A a=new A();a.show();  B b=new B() ;b.show(); E e=new E(); e.show();  C c;
        D d=new D(); d.show();  c=new D();c.show1();
    }
}
