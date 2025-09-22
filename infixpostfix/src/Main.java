import java.util.Stack;

class PostfixToPrefixConverter {
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            }

            else if (isOperator(c)) {

                String operand2 = stack.pop();
                String operand1 = stack.pop();


                String prefixExpression = c + operand1 + operand2;
                stack.push(prefixExpression);
            }
        }


        return stack.pop();
    }


    public static void main(String[] args) {
        String postfix = "AB+C*";
        String prefix = postfixToPrefix(postfix);

        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Prefix Expression: " + prefix);
    }
}