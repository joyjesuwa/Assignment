package constructor;
class condemo
{    int x,y,z;
    condemo() { x=y=z=1; }
    condemo(int a) { x=y=z=a; }
    condemo(int p,int q,int r) { x=p; y=q; z=r; }
    condemo(condemo p) {x = p.x; y=p.y;  z=p.z; }
    void sum()
    {    System.out.println("sum of the values:"+ (x+y+z));
    }
};
public class constructordemo {
    public static void main(String args[ ])
    {    condemo c1=new condemo();
        condemo c2=new condemo(5);
        condemo c3=new condemo(1,2,3);
        condemo c4=new condemo(c3);
        c1.sum(); c2.sum();
        c3.sum(); c4.sum();
    }
}
