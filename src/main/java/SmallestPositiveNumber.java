import java.util.ArrayList;
import java.util.List;

/**
 * find the smallest positive missing integer in a given array
 */
public class SmallestPositiveNumber {
    public static void main(String[] args) {
        SmallestPositiveNumber smallestPositiveNumber = new SmallestPositiveNumber();
        int[] input = {-1,-2,-4,1};
        System.out.println(smallestPositiveNumber.findSmallestPositiveInt(input));
    }

    private int findSmallestPositiveInt(int[] input) {
        int[] positiveInt = getOnlyPositiveInt(input);
        return getSmallestPositive(positiveInt);
    }

    private int getSmallestPositive(int[] positiveInt) {
        for(int i=0; i < positiveInt.length ; i++) {
            if((Math.abs(positiveInt[i] -1) < positiveInt.length) && (positiveInt [Math.abs(positiveInt[i]) - 1] > 0)) {
                positiveInt [Math.abs(positiveInt[i]) - 1] = - (positiveInt [Math.abs(positiveInt[i]) - 1]);
            }
        }

        for(int i=0; i < positiveInt.length ; i++) {
            if( positiveInt[i] > 0) {
                return i+1;
            }
        }

        return positiveInt.length + 1;
    }

    private int[] getOnlyPositiveInt(int[] input) {
        List<Integer> positiveValues = new ArrayList<>();

        for(int i : input) {
            if(i > 0) {
                positiveValues.add(i);
            }
        }
        return positiveValues.stream().mapToInt(i->i).toArray();
    }
}
