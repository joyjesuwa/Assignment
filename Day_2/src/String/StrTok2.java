package String;
import java.util.*;
public class StrTok2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = new String();
        int count=0;
        System.out.println("Enter a string");
        str = s.nextLine();
        StringTokenizer stzer = new StringTokenizer(str);
        while(stzer.hasMoreTokens())
        {
            System.out.println("Integer:"+stzer.nextToken());
            count+=Integer.parseInt(stzer.nextToken());
        }
        System.out.println("Total :"+count);
    }
}
