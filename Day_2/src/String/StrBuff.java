package String;

public class StrBuff {
    public static void main(String[] args) {
        StringBuffer s1,s2,s3;
        s1 = new StringBuffer();
        s2 = new StringBuffer("Cricket Ground");
        s3 = new StringBuffer(100);
        System.out.println(s1.capacity());
        System.out.println(s2.capacity());
        System.out.println(s3.capacity());
        System.out.println(s1.capacity()+ s2.capacity()+ s3.capacity());
    }
}
