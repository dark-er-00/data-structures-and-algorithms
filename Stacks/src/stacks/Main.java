package stacks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stacks stacks = new Stacks();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("\n=== MENU ===");
            System.out.println("[1] - Push");
            System.out.println("[2] - Pop");
            System.out.println("[3] - Peek");
            System.out.println("[4] - Display All");
            System.out.println("[5] - Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter a number to push: ");
                    int value = scanner.nextInt();
                    
                    stacks.push(value);
                    break;
                    
                case 2:
                    stacks.pop();
                    break;
                    
                case 3:
                    stacks.peek();
                    break;
                    
                case 4:
                    stacks.display();
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
