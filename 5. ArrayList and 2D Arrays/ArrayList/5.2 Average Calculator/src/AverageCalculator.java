import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double count = 0;
        for (int len = 0; len < numbers.size(); len++){
            count += (double)numbers.get(len);
        }
        count = count/(double)numbers.size();
        return count;
    }
}