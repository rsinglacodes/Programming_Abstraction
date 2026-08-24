public class circularmiddle {
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

    static void findmiddle(){
        Node slow= head;
        Node fast = head;

        while(fast.next!=head && slow.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println("Middle: "+slow.data);
    }
    
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);

        findmiddle();
    }
}
