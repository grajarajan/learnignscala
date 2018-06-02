//given an array find product of all elements except self

public class ProductOfArrayElementExceptSelf {
    private void findProduct(int[] input) {
        int[] product = new int[input.length];

        //right iteration
        int holder = 1;
        for (int i = 0 ; i < input.length ; i++) {
            product[i] = holder;
            holder *= input[i];
            //System.out.println(temp);
        }

        //left iteration
        holder = 1;
        for (int i = input.length-1 ; i >= 0 ; i--) {
            product[i] *= holder;
            holder *= input[i];
        }

        for (int i : product) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ProductOfArrayElementExceptSelf product = new ProductOfArrayElementExceptSelf();
        int[] input = {1,2,3};
        product.findProduct(input);
    }
}
