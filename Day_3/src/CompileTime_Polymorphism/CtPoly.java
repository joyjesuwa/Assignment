package CompileTime_Polymorphism;

class A
{    public void fun1(int x)
{    System.out.println("The value of class A is : " + x);
}
    public void fun1(int x,int y)
    {    System.out.println("The value of class B is : "+x +" and "+ y);
    }
}
public class CtPoly {
    public static void main(String[] args) {
        A obj=new A();
        // Here compiler decides that fun1(int) is to be called and "int" will be printed.
        obj.fun1(2);
        // Here compiler decides that fun1(int,int) is to be called and "int and int" will be printed.
        obj.fun1(2,3);
    }

}
