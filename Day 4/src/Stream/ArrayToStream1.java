package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class ArrayToStream1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // compute sum of absolute values of even ints
        int[] numbers = {3, -4, 8, 4, -2, 17,
                9, -10, 14, 6, -12};
        IntStream s= Arrays.stream(numbers);
        System.out.println("Integer Stream from Arrays "+s.count());
        int sum = Arrays.stream(numbers)
                .map(n -> Math.abs(n))  // abs stands for absolute value only positive value
                .filter(n -> n % 2 == 0)
                .distinct()
                .sum();
    }

}

