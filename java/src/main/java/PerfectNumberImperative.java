import java.util.ArrayList;

public class PerfectNumberImperative {

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

     public static int getSum(ArrayList<Integer> numbers){
         int sum = 0;
         for(int i : numbers){
             sum += i;
         }
         return sum;
     }

    public static boolean isPerfect(int number) {
        return number > 0 && getSum(getFactors(number)) == number;
    }
}