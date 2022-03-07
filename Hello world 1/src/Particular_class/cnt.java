package Particular_class;
class obj{
    static int sec;
    public obj(){
        sec++;
    }
    static void display()
    {
        System.out.println("Time in sec:" +sec);
    }
}
public class cnt {
    public static void main(String[] args) {
        obj A1, A2, A3;
        A1 = new obj();
        A2 = new obj();
        A3 = new obj();
        obj.display();
    }

    }

