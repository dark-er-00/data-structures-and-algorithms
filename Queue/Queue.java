
package queues;

public class Queue {
    private int MAX_SIZE = 5;
    private int[] queueArray = new int[MAX_SIZE];
    private int rear = -1;
    private int front = -1;
    
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        } else {
            if(front == -1){
                front = 0;
            }
        }
        
        queueArray[++rear] = value;
        System.out.println(value +" added to the queue.");
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println("Element removed from queue is: "+ queueArray[front++]);
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to peek.");
        } else {
            System.out.println("Front element is "+ queueArray[front]);
        }
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to display");
        } else {
            System.out.print("Elements in queue: ");
            for(int i = front; i <= rear; i++){
                System.out.print(queueArray[i] + " ");
            }
        }
    }
    
    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }
    
    public boolean isEmpty(){
        return front == -1 || front > rear;
    }
}
