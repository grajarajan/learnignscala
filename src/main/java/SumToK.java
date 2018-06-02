//Given an Array and a sum , return true if two elements of the array produces the sum

import java.util.HashMap;
import java.util.Map;

public class SumToK {

    private boolean isSumAvailable(int[] input, int sum){

        Map<Integer,Integer> remainingHolder = new HashMap();

        for (int i : input) {
            if(remainingHolder.containsKey(i)){
                return true;
            }
            remainingHolder.put((sum-i),i);
        }
        return false;
    }

    public static void main(String[] args) {
        SumToK sumToK = new SumToK();
        int[] input = {2,3,2,4,34};
        System.out.println(sumToK.isSumAvailable(input, 5));
    }
}
