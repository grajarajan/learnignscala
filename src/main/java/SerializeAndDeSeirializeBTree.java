//Given the val of a binary tree serialize and deserialize it

public class SerializeAndDeSeirializeBTree {

    private String serialize(Node node) {

        if(node == null) {
            return "LeafEnd";
        }

        StringBuilder builder = new StringBuilder();
        builder.append(node.val);
        builder.append("End");

        builder.append(serialize(node.left));
        builder.append(serialize(node.right));

        return builder.toString();

    }

    private Node deserializeString(String inputString){
        Node node = deserialize(inputString.split("End"), new int[]{0});
        return node;
    }

    private Node deserialize(String[] input, int[] position) {

        if(input[position[0]].equals("Leaf") || position[0] > input.length ) {
            position[0] ++;
            return null;
        }

        Node root = new Node(Integer.parseInt(input[position[0]++]));

        root.left = deserialize(input, position);
        root.right = deserialize(input, position);

        return root;

    }

    private Node createTestTree(){
        Node leaf1 = new Node(12);
        leaf1.left = new Node(10);
        leaf1.right = new Node(14);

        Node leaf2 = new Node(8);
        leaf2.left = new Node(4);
        leaf2.right = leaf1;

        Node root = new Node(20);
        root.left = leaf2;
        root.right = new Node(22);

        return root;
    }

    public static void main(String[] args) {
        SerializeAndDeSeirializeBTree tree = new SerializeAndDeSeirializeBTree();
        Node root = tree.createTestTree();
        String serializedString = tree.serialize(root);
        System.out.println(serializedString);

        Node deserializedNode = tree.deserializeString(serializedString);
        System.out.println(deserializedNode);
    }

}

class Node {
    int val; Node left, right;
    public Node(int val) {
        this.val = val;
    }
}
