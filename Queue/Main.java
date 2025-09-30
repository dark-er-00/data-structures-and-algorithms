package queues;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        
        while(true){
            System.out.println("\n=== MENU ===");
            System.out.println("[1] - Add");
            System.out.println("[2] - Delete");
            System.out.println("[3] - Display");
            System.out.println("[4] - Display Front");
            System.out.println("[5] - Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter number to be added to the queue: ");
                    int value = scanner.nextInt();
                    
                    queue.enqueue(value);
                    break;
                    
                case 2:
                    queue.dequeue();
                    break;
                    
                case 3:
                    queue.display();
                    break;
                    
                case 4:
                    queue.peek();
                    break;
                    
                case 5:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
