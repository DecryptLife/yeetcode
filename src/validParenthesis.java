import java.util.Stack;

public class validParenthesis {

    public static boolean checkValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch == '[' || ch == '{' || ch == '(')
            {
                stack.push(ch);
            }
            else
            {
                switch(ch)
                {

                    case ']':
                        if(!stack.empty() && stack.peek() == '[')
                            stack.pop();
                        else
                            stack.push(ch);
                        break;
                    case '}':
                        if(!stack.empty() && stack.peek() == '{')
                            stack.pop();
                        else
                            stack.push(ch);
                        break;
                    case ')':
                        if(!stack.empty() && stack.peek() == '(')
                            stack.pop();
                        else
                            stack.push(ch);
                        break;
                }
            }
        }

        if(stack.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println(s1 + " is " +checkValid(s1));
        System.out.println(s2 + " is " +checkValid(s2));
        System.out.println(s3 + " is " + checkValid(s3));
    }

}
