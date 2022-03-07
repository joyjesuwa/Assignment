package Different_class;

class Mob
{    String name;
    int ram;
    String os;
}
public class mobile {
    public static void main(String args[ ])
    {
        Mob m = new Mob();
        m.name = "Redmi";
        m.ram = 4;
        m.os = "Android 10";
        System.out.println("Name:" + m.name + " Ram:" + m.ram + "Operating System:" + m.os);
    }
}
