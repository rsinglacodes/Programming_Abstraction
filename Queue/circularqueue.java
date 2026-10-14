public class circularqueue {
    static class queue{
        void enqueue(int val){
            if(size == capacity){

            }
        }

        void dequeue(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }

            System.out.println("removed" + arr[front]);
            front = (front+1)%capacity;
            size--;

        }

        void display(){
             if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("queue");
            for(int i=0;i<size;i++){
                int index = (front+1)%capacity;
                
            }
        }
    }
}
