import java.util.stream.IntStream;

public class PerfectNumberFunctional {
    public static boolean isPerfect(int number) {
            return number > 0 && 
              IntStream.range(1, number)
                       .filter(n -> number % n == 0)
                       .sum() == number;
    }
}