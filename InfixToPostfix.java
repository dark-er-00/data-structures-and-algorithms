package infixtopostfix;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("\n== Infix to Postfix Converter ==");
            System.out.print("Enter Infix expression: ");
            String expression = scanner.nextLine();
            
            System.out.println("Postfix expression: "+ infixToPostfix(expression));
        }
    }
    
    static int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    static String infixToPostfix(String expression){
        StringBuilder result = new StringBuilder();
        Stacks stack = new Stacks(expression.length());
        
        if(hasSpace(expression)){
            return "Expression must not have spaces.";
        }
        
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        
        return result.toString();
    }
    
    static boolean hasSpace(String expression){
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            
            if(c == ' '){
                return true;
            }
        }
        return false;
    }
}

class Stacks{
    private int MAX_SIZE;
    private int top;
    private char[] charStack;
    
    Stacks(int size){
        MAX_SIZE = size;
        top = -1;
        charStack = new char[MAX_SIZE];
    }
    
    public void push(char value){
        if(!isFull()){
            charStack[++top] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }
    
    public char pop(){
        if(!isEmpty()){
            return charStack[top--];
        }
        return 0;
    }
    
    public char peek(){
        if(!isEmpty()){
            return charStack[top];
        }
        return 0;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == MAX_SIZE - 1;
    }
}