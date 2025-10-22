package stacks;
public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "A+(B*C-(D/E^F)*G)*H";
        System.out.println("Infix Expression:   " + infix);
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
    
    // Function to return precedence of operators
    static int precedence(char c) {
        switch (c) {
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
    
    // Function to convert Infix to Postfix
    static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stacks stacks = new Stacks(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If operand, add to output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If '(', push to stack
            else if (c == '(') {
                stacks.push(c);
            }
            // If ')', pop until '('
            else if (c == ')') {
                while (!stacks.isEmpty() && stacks.peek() != '(') {
                    result.append(stacks.pop());
                }
                stacks.pop(); // remove '('
            }
            // If operator
            else {
                while (!stacks.isEmpty() && precedence(c) <= precedence(stacks.peek())) {
                    result.append(stacks.pop());
                }
                stacks.push(c);
            }
        }

        // Pop all remaining operators
        while (!stacks.isEmpty()) {
            result.append(stacks.pop());
        }

        return result.toString();
    }
}