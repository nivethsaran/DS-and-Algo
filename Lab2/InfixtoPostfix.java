import java.util.Scanner;
import java.util.Stack;
 
class StackApplication
{
    // A utility function to return precedence of a given operator
    // Higher returned value means higher precedence
    static int Prec(char ch)
    {
        switch (ch)
        {
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
     static boolean isOperator(char a)
     {
    	 if(a=='+'||a=='-'||a=='*'||a=='/'||a=='^')
    	 {
    		 return true;
    	 }
    	 return false;
     }
    // The main method that converts given infix expression
    // to postfix expression. 
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
    	 String result = new String("");
         
        // initializing empty stack
        Stack<Character> stack = new Stack<>();
         int f=0;
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
             if(isOperator(c))
             {
            	 f++;
             }
             else
            	 f=0;
             if(f==2)
            	 return "Invalid Expression";
             // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
              
            // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);
             
            //  If the scanned character is an ')', pop and output from the stack 
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                 
                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression                
                else
                    stack.pop();
            }
            
                else {
            	while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }}
      
        
      
        // pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();
      
        return result;
    }
   
    // Driver method 
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	int testcases = Integer.parseInt(scan.nextLine());
        //String exp = "a+b*(c^d-e)^(f+g*h)-i";
    	while(testcases!=0)
    	{
    		String exp=scan.nextLine();
    		System.out.println(infixToPostfix(exp));
    		testcases--;
    	}
        
    }
} 
