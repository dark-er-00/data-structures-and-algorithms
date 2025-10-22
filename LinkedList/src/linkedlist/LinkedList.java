package linkedlist;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Employee head = null;
        while(true){
            System.out.println("=== MENU ===");
            System.out.println("[1] Add Employee");
            System.out.println("[2] View Employees");
            System.out.println("[3] Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter rate (per day): ");
                    double rate = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Enter number of hours worked: ");
                    double nhw = scanner.nextDouble();
                    
                    Employee newEmployee = new Employee(name, rate, nhw);
                    
                    if(head == null){
                        head = newEmployee;
                    } else {
                        Employee temp = head;
                        while(temp.next != null){
                            temp = temp.next;
                        }
                        
                        temp.next = newEmployee;
                    }
                    break;
                    
                case 2:
                    if(head == null){
                        System.out.println("Add employee first");
                    } else {
                        Employee temp = head;
                        while(temp != null){
                            System.out.print("["+ temp.name +
                                    ", Rate: "+ temp.rate +
                                    ", NHW: "+ temp.rate +
                                    "] -> ");
                            temp = temp.next;
                        }
                        System.out.println("NULL");
                    }
                    break;
                    
                case 3:
                    System.out.println("Thank you for using the program");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

class Employee{
    String name;
    double rate;
    double nhw;
    Employee next;
    
    public Employee(String name, double rate, double nhw){
        this.name = name;
        this.rate = rate;
        this.nhw = nhw;
        this.next = null;
    }
}