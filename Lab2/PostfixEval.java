

import java.util.Scanner;

class StackApplication {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        CapacityGetterSetter getset = new CapacityGetterSetter();
         
        int testcases = Integer.parseInt(scan.nextLine());
        int inputs = Integer.parseInt(scan.nextLine());
        getset.setCapacity(inputs);
        StackApplication SA=new StackApplication();
        
        while (testcases >0) {
            	String pattern = scan.nextLine();
            	SA.evaluatePostfix(pattern);
            	testcases--;
            }
        }
   public int evaluatePostfix(String input)
   {stack S= new StackArray();
	   for(int i=0;i<input.length();i++)
	   {
		   char ch=input.charAt(i);
		   if(Character.isDigit(ch))
	            S.push(ch - '0');
	             
	            
	            else
	            {
	                int val1 = S.pop();
	                int val2 = S.pop();
	                 
	                switch(ch)
	                {
	                    case '+':
	                    S.push(val2+val1);
	                    break;
	                     
	                    case '-':
	                    S.push(val2- val1);
	                    break;
	                     
	                    case '/':
	                    S.push(val2/val1);
	                    break;
	                     
	                    case '*':
	                    S.push(val2*val1);
	                    break;
	              }
	            }
	        }
	        return S.pop(); 
	   }
		   
   }
         
     

 
interface stack {
    int size();
    boolean isEmpty();
    void push(int e);
    int pop();
    int top();
    
    void printStack();
}
 
class CapacityGetterSetter {
    private static int stackcap;
 
    public int getCapacity() {
        return this.stackcap;
    }
 
    public void setCapacity(int cap) {
        stackcap = cap;
    }
}
 
class StackArray implements stack {
    // public static final int CAPACITY=20;
    CapacityGetterSetter getset = new CapacityGetterSetter();
    private int[] data; // array container
    private int t = -1; // index to top position
    // constructor
    int CAPACITY=0;
 
    public int evaluatePostfix(String input)
    {
    	
    }
    public StackArray() {
        CAPACITY = getset.getCapacity();
        data = new int[CAPACITY];
        t=-1;
    }
 
    public int size() {
        // TODO Auto-generated method stub
        return (t + 1);
    }
 
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (t < 0);
    }
    public boolean isFull()
    {
        return (size() == CAPACITY);

    }
 
    public void push(int e) {
        // TODO Auto-generated method stub
        if (size() == CAPACITY)
        {
            System.out.println("StackFullException");
        }
        else {
            t = t + 1;
            data[t] = e;
        }
    }
 
    public int top() {
        // TODO Auto-generated method stub
        if (isEmpty()){
            System.out.println("StackEmptyException");
            return -1;
        }
        else {
            return data[t];
        }
    }
 
    public int pop() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            System.out.println("StackEmptyException");
            return -1;
        } else {
            int temp = data[t];
            t = t - 1;
            return temp;
        }
 
    }
 
    public void printStack() {
        if (isEmpty())
            System.out.println("Empty");
        else{
            for (int i = 0; i < t+1; i++) {
               
                    System.out.print(data[i] + " ");
            }
            System.out.println("  ");
        }
    }
 
    public void flush(){
    	t=-1;
    }
    
     
}
