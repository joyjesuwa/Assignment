package Method_Overloading;
class MethOver
{
    public void show()
    {
        System.out.println("show called with no parameters");
    }
    public void show(int a)
    {
        System.out.println("Square root:"+Math.sqrt(a));
    }
    public void show(int a,int b)
    {
        System.out.println("sum:"+(a+b));
    }
    public void show(float a,int b)
    {
        System.out.println("Power value:"+Math.pow(a,b));
    }
}
public class MethOverL {
    public static void main(String [ ]args)
    {
            MethOver mo = new MethOver();
            mo.show();
            mo.show(121);
            mo.show(4,5);
            mo.show(2.3f,4);
        }

    }




