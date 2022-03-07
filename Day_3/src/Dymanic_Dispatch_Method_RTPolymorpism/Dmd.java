package Dymanic_Dispatch_Method_RTPolymorpism;

class A
{    void callme()
{    System.out.println("Inside A's callme Method");
}
}
class B extends A
{    void callme()    //override callme()
{    System.out.println("Inside B's callme Method");
}
}
class C extends A
{    void callme()    // override callme()
{    System.out.println("Inside C's callme Method");
}
}
public class Dmd {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        A r;     // obtains a reference of type A
        r=a; r.callme();
        r=b; r.callme();
        r=c; r.callme();
    }
}
