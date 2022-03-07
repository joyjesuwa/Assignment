package String;

import java.util.*;
public class StrTok1 {
    public static void main(String[] args) {
        int sum=0;
        String s1="Let us work";
        StringTokenizer st1=new StringTokenizer(s1);
        System.out.println("No. of Words "+st1.countTokens());
        sum=st1.countTokens()-1;
        while(st1.hasMoreTokens())
            sum=sum+st1.nextToken().length();
        System.out.println("No. of Chars "+sum);
    }
}
