package String;

public class CompStr {
    public static void main(String[] args) {
        String s1="Mobile phone";
        String s2="Tablet";
        if (s1.compareTo(s2)>0)
            System.out.println("s1 is greater");
        else if (s2.compareTo(s1)>0)
            System.out.println("s2 is greater");
        else
            System.out.println("Both are equal");
    }
}
