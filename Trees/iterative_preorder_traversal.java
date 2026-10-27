import java.util.ArrayList;
import java.util.Stack;

public class iterative_preorder_traversal {

    static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        Stack<Node> st = new Stack<>();
        
        st.push(root);
        
        while(!st.isEmpty()){
            Node curr = st.pop();
            list.add(curr.data);
            
            if(curr.right != null){
                st.push(curr.right);
            }
            
            if(curr.left != null){
                st.push(curr.left);
            }
        }
        
        return list;
    }

    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(preOrder(root));        
    }

}
class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
    }
}