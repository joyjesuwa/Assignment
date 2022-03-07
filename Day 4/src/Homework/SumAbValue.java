package Homework;
import java.util.stream.IntStream;
public class SumAbValue {
    public static void main(String[] args) {
        int sumAbsVal = IntStream.of(-1,2,-4,6,-9)
                .map(n-> Math.abs(n)))
       // .sum();
        System.out.println(sumAbsVal);


    }
}
