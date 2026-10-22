public class count_nodes {

    static int count(Node root){
        if(root == null){
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(count(root));
    }
}

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
    }
}
