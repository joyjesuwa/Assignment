package Wrapper_Class;
//abstract class A//Without method
//{

  //      }
abstract class A
{     abstract void disp();//With method
}
class B extends A
{    void disp()
{    System.out.println ("Well");
}
}
class C
    {
        public static void main(String args[ ])
    {    A t;
        B k=new B();
        t=(A)k;    t.disp();
    }
    }

