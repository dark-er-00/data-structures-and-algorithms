package linked_list;

import java.util.Scanner;

public class OneTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Employee head = null;
        
        Employee newEmployee = new Employee("Roland", 79.00, 100.00);
        head = newEmployee;
        
        newEmployee = new Employee("Maxine", 20.00, 80.00);
        head.next = newEmployee;
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
                    
        System.out.print("Enter rate (per day): ");
        double rate = scanner.nextDouble();
        scanner.nextLine();
                    
        System.out.print("Enter number of hours worked: ");
        double nhw = scanner.nextDouble();
                    
        newEmployee = new Employee(name, rate, nhw);
        head.next.next = newEmployee;
        
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