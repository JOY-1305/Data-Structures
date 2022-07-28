import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner ;
import java.util.Stack; 

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    

public class DSstack {

// private Node head ;  
// private int size  ;


//     //Define the data members
    


//     public Stack() {
//         //Implement the Constructor
//         head = null ; 
//         size = 0 ; 
//     }



//     /*----------------- Public Functions of Stack -----------------*/


//     public int getSize() { 
//         //Implement the getSize() function
//         return size ; 
//     }

//     public boolean isEmpty() {
//         //Implement the isEmpty() function
//         return size == 0  ; 
//     }

//     public void push(int element) {
//         //Implement the push(element) function
//         Node newNode = new Node(element) ;
//         newNode.next = head ; 
//         head = newNode ; 
//         size ++ ; 
//     }

//     public int pop() {
//         //Implement the pop() function
//         if(head==null)
//         return -1 ; 
//         int temp = head.data ; 
//         head = head.next ; 
//         size-- ; 
//         return temp ; 
//     }

//     public int top() {
//         //Implement the top() function
//         if(head == null)
//         return -1 ; 
        
//         return head.data ; 

//     }


// static Stack<Character> stack = new Stack<>() ;
// static boolean check  ;
// public static boolean isBalanced(String expression) {
    //Your code goes here
	// if(expression.length()== 0 )
	// return check = true  ; 

	// if(expression.length()==1)
	// char smallAns = expression.charAt(0) ; 
	// stack.push(smallAns) ; 
	
	// String  smallString = expression.substring(1) ; 
	// System.out.println(expression);

	// if(smallString.charAt(0)!=stack.peek())
	// isBalanced(smallString) ;

	// if(smallString.charAt(0)==stack.peek())
	// stack.pop() ;

	// if(expression.length()>0){
	// smallString = expression.substring(1) ; 
	// isBalanced(smallString) ; 
	// }

	// if(stack.isEmpty()==false)
	// check = false ;
	// return check ; 
	
// 	char ch;
// 	for (int i=0; i<expression.length(); i++) {    
// 	   if (expression.charAt(i)=='('||expression.charAt(i)=='['||expression.charAt(1)=='{') {    
// 		  stack.push(expression.charAt(i));
// 		  continue;
// 	   }
// 	   if (stack.isEmpty())   
// 		  return false;
// 		  switch (expression.charAt(i)) {
// 			 case ')':    
// 				ch = stack.peek();
// 				stack.pop();
// 				if (ch=='{' || ch=='[')
// 				   return false;
// 				   break;
// 			 case '}': 
// 				ch = stack.peek();
// 				stack.pop();
// 				if (ch=='(' || ch=='[')
// 				   return false;
// 				   break;
// 			 case ']': 
// 				ch = stack.peek();
// 				stack.pop();
// 				if (ch =='(' || ch == '{')
// 				   return false;
// 				   break;
// 		  }
// 	   }
// 	   return (stack.isEmpty()); 
// }
// public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
// 	//Your code goes here
// 	if(input.peek()==null)
// 	return ; 
// 	while(input.isEmpty()==false){
// 		int temp = input.pop() ; 
// 		extra.push(temp) ; 
// 	}
// 	while(extra.isEmpty()==false){
// 		int temp = extra.pop() ; 
// 		System.out.print(temp + " ");
// 	}
// }

	// public static boolean checkRedundantBrackets(String expression) {
	// 	Stack<Character> st = new Stack<>();
    //     char[] str = expression.toCharArray();
    //     for (char ch : str) {
 
    //         if (ch == ')') {
    //             char top = st.peek();
    //             st.pop();
 
    //             boolean flag = true;
 
    //             while (top != '(') {
 
    //                 if (top == '+' || top == '-'
    //                         || top == '*' || top == '/') {
    //                     flag = false;
    //                 }
 
    //                 top = st.peek();
    //                 st.pop();
    //             }
 
    //             if (flag == true) {
    //                 return true;
    //             }
    //         } else {
    //             st.push(ch); 
    //         }                
    //     }
    //     return false;
	// }

	public static int[] stockSpan(int[] price) {
		//Your code goes here
		int [] ans = new int[price.length] ; 
		ans[0] = 1;
		int n = price.length ; 
        for (int i = 1; i < n; i++) {
            int counter = 1;
            while ((i - counter) >= 0 && price[i] >= price[i - counter]) {
                counter += ans[i - counter];
            }
            ans[i] = counter;
        }
		return ans ; 
	}

	private static Scanner s = new Scanner(System.in);

	// public static void main(String[] args) {
		// Stack stack = new Stack();

		// int q = s.nextInt();

		// while (q > 0) {
		// 	int choice, input;
		// 	choice = s.nextInt();

		// 	switch(choice) {
		// 		case 1:
		// 			input = s.nextInt();
		// 			stack.push(input);
		// 			break;

		// 		case 2:
		// 			System.out.println(stack.pop());
		// 			break;

		// 		case 3:
		// 			System.out.println(stack.top());
		// 			break;

		// 		case 4:
		// 			System.out.println(stack.getSize());
		// 			break; 

		// 		default: 
		// 			System.out.println((stack.isEmpty()) ? "true" : "false");
		// 	}

		// 	q -= 1;
		// }

        

	//}

    // static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // public static void main(String[] args) throws NumberFormatException, IOException {
    //     String expression = br.readLine().trim();
    //     System.out.println(isBalanced(expression));
    // }

	// static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // public static Stack<Integer> takeInput() throws NumberFormatException, IOException {
    // 	int size = Integer.parseInt(br.readLine().trim());
    // 	Stack<Integer> input = new Stack<>();

    // 	if (size == 0) {
    // 		return input;
    // 	}
    	
    // 	String[] values = br.readLine().trim().split(" ");

    // 	for(int i = 0; i < size; i++) {
    // 		input.push(Integer.parseInt(values[i]));
    // 	}

    // 	return input;
    // }

    // public static void main(String[] args) throws NumberFormatException, IOException {
    // 	Stack<Integer> input = takeInput();
    // 	Stack<Integer> empty = new Stack<>();

    // 	reverseStack(input, empty);

    // 	while(!input.isEmpty()) {
    // 		System.out.print(input.pop() + " ");
    // 	}

    // }
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws NumberFormatException, IOException {
    	int size = Integer.parseInt(br.readLine().trim());
    	int[] input = new int[size];

    	if (size == 0) {
    		return input;
    	}

    	String[] values = br.readLine().trim().split(" ");

    	for(int i = 0; i < size; i++) {
    		input[i] = Integer.parseInt(values[i]);
    	}

    	return input;
    }

    public static void printArray(int[] arr) {
    	for (int i = 0 ; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}

    	System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	int[] input = takeInput();

    	int[] output = stockSpan(input);

    	printArray(output);

    }
} 
