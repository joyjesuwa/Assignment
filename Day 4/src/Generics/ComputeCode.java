package Generics;
import java.util.ArrayList;
import java.util.List;
public class ComputeCode {
    public static void main(String[] args) {
        // Using Generic
        List<Street> list = new ArrayList(); // 1
        Street s = new Street("Boardwalk", 400, 222);
        list.add(s); // 2
        System.out.print(list.get(0).getNum());// 3
    }
}
