public class sumoflongrootleave {
    static int maxSum = 0;
    static int maxlength = 0;

    static void solve(Node root, int length, int sum) {
        if (root == null) {
            return;
        }
        length++;
        sum += root.data;
        if (root.left == null && root.right == null) {
            if (length > maxlength) {
                maxlength = length;
                maxSum = sum;
            } else if (length == maxlength) {
                maxSum = Math.max(maxSum, sum);
            }
            return;
        }
        solve(root.left, length, sum);
        solve(root.right, length, sum);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);


        maxlength = 0;
        maxSum = 0;
        solve(root, 0, 0);
        System.out.println(maxSum);        
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;

    }
}
