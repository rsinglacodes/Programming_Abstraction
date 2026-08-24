public class circularLL{

    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    static Node head = null;
    static void insert(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            newnode.next = head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }

    static void reverse(Node curr,Node start){
        if(curr.next==start){
            System.out.println(curr.data+" ");
            return ;
        }
        reverse(curr.next, start);
        System.out.println(curr.data+" ");
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);

        reverse(head, head);
    }
}