//In a given Array find all Subsets of its elements

public class FindAllSubSets {

    private void subsets(int[] input, int[]set, int position) {
        if(input.length == position) {
            System.out.println("set:");
            for (int i : set) {
                System.out.println(i);
            }
            return;
        }

        //no
        set[position] = 0;  // zero means a null here.
        subsets(input, set, position+1);

        //yes
        set[position] = input[position];
        subsets(input, set, position+1);
    }

    public static void main(String[] args) {
        FindAllSubSets subsets = new FindAllSubSets();
        int[] input = {3,2};
        // the possible sets are {nullnull}, {null,3},{null,2},{3,2}
        int[] subset = new int[input.length];

        subsets.subsets(input, subset, 0);
    }
}
