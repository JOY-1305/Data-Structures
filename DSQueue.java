import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Input {
	int n;
	int k;
	Queue<Integer> queue;

	public Input(int n, int k, Queue<Integer> queue) {
		this.queue = queue;
		this.n = n;
		this.k = k;
	}

}

public class DSQueue {


    	//Define the data members
	// private Node  front ;
    // private Node  rear ;
    // int size ;

	// public Queue() {
	// 	//Implement the Constructor
    //     front = null ;
    //     rear = null ;
    //     size = 0 ;
	// }



	/*----------------- Public Functions of Stack -----------------*/


	// public int getSize() {
	// 	//Implement the getSize() function
    //     return size ;
    // }


    // public boolean isEmpty() {
    // 	//Implement the isEmpty() function
    //     if(size == 0 )
    //         return true ;
    //     else
    //         return false ;

    // }


    // public void enqueue(int data) {
    // 	//Implement the enqueue(element) function
    //     Node newNode = new Node(data) ;
    //     if(size == 0){
    //         front = newNode ;
    //         rear = newNode ;
    //     }
    //     rear.next = newNode;
    //     rear = newNode ;
    //     size ++ ;

    // }

	// public void returnNULL(){
	// 	return ;
	// }
    // public int dequeue() {
    // 	//Implement the dequeue() function
	// 	size-- ;
    //     if(front == null){
    //         rear = null ;
	// 		returnNULL();
    //     }
    //     Node temp = front ;
    //     front = front.next ;
    //     return temp.data ;
    // }


    // public int front() {
    // 	//Implement the front() function
    //     if(front == null)
    //         return -1 ;
    //     return front.data ;
    // }

	// public static void reverseQueue(Queue<Integer> input) {
	// 	//Your code goes here
	// 	int n = input.size() ; 
	// 	int [] arr = new int[n];
	// 	for(int i = n-1 ; i >= 0 ; i--){
	// 		arr[i] = input.poll() ;
			
	// 	}
	//     for(int  i = 0 ; i < n ; i ++ ){
	// 		input.add(arr[i]) ; 
	// 	}
	// 	// for(int i = arr.length-1 ; i <= 0 ; i++){
	// 	// 	input.add(arr[i]) ;
	// 	// 	System.out.print(input.poll() + " ");
	// 	// }

	// }
    // private static Scanner s = new Scanner(System.in);

	//public static void main(String[] args) {
		// Queue queue = new Queue();

		// int q = s.nextInt();

		// while (q > 0) {
		// 	int choice, input;
		// 	choice = s.nextInt();

		// 	switch(choice) {
		// 		case 1:
		// 			input = s.nextInt();
		// 			queue.enqueue(input);
		// 			break;

		// 		case 2:
		// 			System.out.println(queue.dequeue());
		// 			break;

		// 		case 3:
		// 			System.out.println(queue.front());
		// 			break;

		// 		case 4:
		// 			System.out.println(queue.getSize());
		// 			break;

		// 		default:
		// 			System.out.println((queue.isEmpty()) ? "true" : "false");
		// 	}

		// 	q -= 1;
		// }

	//}

	// public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
	// 	//Your code goes here
    //     Queue<Integer> queue = new LinkedList<Integer>() ;
    //     int s  = input.size() ; 
	// 	int [] smallTemp = new int [k] ; 

    //     for(int i = k-1 ; i >= 0 ; i--){
	// 		smallTemp[i] = input.poll() ;
	// 	}
		
	// 	for(int j = 0 ; j < k ; j++){
	// 		queue.add(smallTemp[j]) ; 
	// 	}

	// 	for(int  i = s - k ; i > 0 ; i-- )
	// 	{
	// 		queue.add(input.poll()) ; 
	// 	}

	// 	return queue ;
	// }

	// public static void reverseQueue(Queue<Integer> input) {
	// 	//Your code goes here
    //     int n = input.size() ; 
	// 	int [] arr = new int[n];

    //     for(int i = n-1 ; i >= 0 ; i--){
	// 		arr[i] = input.poll() ;
			
	// 	}
        
	//     for(int  i = 0 ; i < n ; i ++ ){
	// 		input.add(arr[i]) ; 
	// 	}
        
	// }


	// static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // public static Input takeInput() throws NumberFormatException, IOException {
    // 	String[] n_k = br.readLine().trim().split(" ");

    // 	int n = Integer.parseInt(n_k[0]);
    // 	int k = Integer.parseInt(n_k[1]);

    // 	String[] values = br.readLine().trim().split(" ");

    // 	Queue<Integer> queue = new LinkedList<>();

    // 	for (int i = 0; i < n; i++) {
    // 		queue.add(Integer.parseInt(values[i]));
    // 	}

    // 	return new Input(n, k, queue);

    // } 
	

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
	}
}