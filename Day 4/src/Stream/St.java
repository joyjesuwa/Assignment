package Stream;
import java.util.stream.*;
public class St {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 6)
                .map(n -> n * n)
                .sum();
        System.out.println(sum);
    }
}
