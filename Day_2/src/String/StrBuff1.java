package String;

public class StrBuff1 {
    public static void main(String[] args) {


        StringBuffer sb = new StringBuffer("Universe");
        System.out.println("buffer= " + sb);
        System.out.println("length= " + sb.length());
        System.out.println("capacity= " + sb.capacity());
        String s;
        int a = 42;
        StringBuffer sb1 = new StringBuffer(40);
        s = sb1.append("a=").append(a).append("!").toString();
        System.out.println(s);
        StringBuffer sb2 = new StringBuffer("HI WOW!");
        sb2.insert(2, "LIKE");
        System.out.println(sb2);
    }
}
