package simplest.possible.implementation;

import static java.util.Collections.emptyList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number)
    {
        if(number == 2)
            return List.of(2);
        return emptyList();
    }
}
