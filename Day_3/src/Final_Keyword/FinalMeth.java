package Final_Keyword;

class As
{     public void show()
{    System.out.println("A Class");
}
    final void display(int a)
    {    System.out.println("A Class a value is"+a);

    }
}
class Bs extends As
{    public void show()
{    super.show();
    System.out .println("B class");
}
  //  void display(int a)  //final method can't be overridden
   // {    System.out.println("a is"+a);
   // }
}
public class FinalMeth {
    public static void main(String[] args) {
        As a=new As();
        Bs b=new Bs();
        a.show();
        b.show();
        a.display(8);
        b.display(3);
    }
}
