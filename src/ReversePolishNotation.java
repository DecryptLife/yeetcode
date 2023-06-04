import java.util.Stack;

public class ReversePolishNotation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int a=0;
        int b=0;
        for(String token:tokens)
        {

            switch(token){
                case "+":
                    a = stack.pop();
                    b = stack.pop();

                    stack.push(a+b);

                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();

                    stack.push(b-a);
                    break;
                case "/":

                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b/a);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();

                    stack.push(a*b);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] exp1 = {"2","1","+","3","*"};
        String[] exp2 = {"4","13","5","/","+"};
        String[] exp3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(exp1));
        System.out.println(evalRPN(exp2));
        System.out.println(evalRPN(exp3));

    }
}
