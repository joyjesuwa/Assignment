package All_Modifiers;
class demo{
    int x;
    public float y;
    private int z;
    protected int p;

}
public class modifiers {
    public static void main(String[] args) {
        demo d=new demo();
        d.x(20);
        d.y(50);
        d.p(60);
        System.out.println("x:"+ d.x + "y:" + d.y + "z:" + d.p );
    }
}
