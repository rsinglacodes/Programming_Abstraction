import java.util.ArrayList;
import java.util.Stack;

public class iterative_inorder_traversal {
    static ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(!st.isEmpty() || curr!=null){

            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            
            curr = st.pop();    
            ans.add(curr.data);
            
            curr=curr.right;
            
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(inOrder(root));        
    }

}
class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
    }
}
