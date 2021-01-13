package day18;

public class Node {
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
    }

    public static void addNode(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                addNode(node.left, value);
            } else {
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                addNode(node.right, value);
            } else {
                node.right = new Node(value);
            }
        }
    }

    public static void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print("" + node.value + " ");
            dfs(node.right);
        }
    }
}
