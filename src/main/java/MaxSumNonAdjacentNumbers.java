/**
 * Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers in
 * the sequence should be adjacent in the array.
 *
 * Input = {3,2,7,10}
 * output : 13
 *
 * input = {5,2,10,100,10,5}
 * output:110
 *
 * input = {1,2,3}
 * output : 4
 */
public class MaxSumNonAdjacentNumbers {
    public static void main(String[] args) {
        MaxSumNonAdjacentNumbers nonAdjacentNumbers = new MaxSumNonAdjacentNumbers();
        int[] input = {5,2,10,100,10,5};
        System.out.println(nonAdjacentNumbers.calculateSum(input));
    }

    private int calculateSum(int[] input) {

        if(input.length == 0) {
            return 0;
        }
        int included=input[0],excluded=0,max=0;

        for(int i=1 ; i< input.length ; i++) {
            max = included > excluded ? included : excluded;

            included = excluded + input[i];
            excluded = max;
        }

        return included > excluded ? included : excluded;
    }
}
