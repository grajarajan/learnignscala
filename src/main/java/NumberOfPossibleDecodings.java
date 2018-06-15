/**
 * Let 1 represent 'A', 2 represents 'B', etc. Given a digit sequence, count the number of possible decodings of the given digit sequence
 *
 * input = "12"
 * output : 3
 *
 * input = "1234"
 * output : 3
 */
public class NumberOfPossibleDecodings {
    public static void main(String[] args) {
        NumberOfPossibleDecodings numberOfPossibleDecodings = new NumberOfPossibleDecodings();
        char[] input = {'1','2','1','2'};
        System.out.println(numberOfPossibleDecodings.decodingsCount(input));
    }

    private int decodingsCount(char[] input) {

        int[] count = new int[input.length + 1];

        count[0] = 1;
        count[1] = 1;

        for(int i=2 ; i <= input.length; i++) {
            count[i] = 0;

            if(input[i-1] > '0') {
                count[i] = count[i-1];
            }

            if(input[i-2] == '1' || (input[i-2] == '2' && input[i-1] < '7')) {
                count[i] += count[i-2];
            }
        }

        return count[input.length];
    }
}
