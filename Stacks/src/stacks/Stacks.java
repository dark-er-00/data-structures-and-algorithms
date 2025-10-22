package stacks;

public class Stacks {
    private int MAX_SIZE = 5;
    private int[] stackArray;
    private int top;
    
    public Stacks(){
        stackArray =  new int[MAX_SIZE];
        top = -1;
    }
    
    public void push(int value){
        if(isFull()){
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: "+ value);
        }
    }
    
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: "+ stackArray[top--]);
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty. Nothing to peek");
        } else {
            System.out.println("Top of the stack is "+ stackArray[top]);
        }
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty. Nothing to display");
        } else {
            System.out.print("Stack content (Top - Bottom): ");
            for(int i = top; i > -1; i--){
                System.out.print(stackArray[i] + " ");
            }
        }
    }
    
    public boolean isEmpty(){
        boolean isEmpty = false;
        
        if(top == -1){
            isEmpty = true;
        }
        
        return isEmpty;
    }
    
    public boolean isFull(){
        boolean isFull = false;
        
        if(top == MAX_SIZE - 1){
            isFull = true;
        }
        
        return isFull;
    }
}