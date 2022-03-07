package String;

public class StrBuffMeth {
    public static void main(String[] args) {
        String s=new String("INFORMATION TECHNOLOGY");
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("Reverse is:"+sb);
        System.out.println("capacity is:"+sb.capacity());
        System.out.println("character at:"+sb.charAt(3));
        System.out.println("delete 2,4:"+sb.delete(2,4));
        System.out.println("delete char at:"+sb.deleteCharAt(3));
        System.out.println("Insert at:"+sb.insert(2,'o'));
        System.out.println("replace:"+sb.replace(2,3,"sr"));
    }
}
