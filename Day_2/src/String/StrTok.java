package String;
import java.util.*;
public class StrTok {
    public static void main(String[] args) {
        String s=new String("How Are You");
        StringTokenizer t=new StringTokenizer(s);
        System.out.println(t.countTokens());
        while(t.hasMoreTokens());
        System.out.println(t.nextToken());
    }
}
