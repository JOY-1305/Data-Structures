import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class BST {
    
	  class BinaryTreeNode<T> 
	  { 
	  		T data; 
	  		BinaryTreeNode<T> left; 
	 		BinaryTreeNode<T> right;
			public BinaryTreeNode(T data) 
			{
	   		this.data = data; 
	   	} 
	   }
	 
	
	  class LinkedListNode<T> 
	  { 
	  		T data; 
	  		LinkedListNode<T> next;
	  		public LinkedListNode(T data) 	
	  		{
	   		this.data = data; 
	   	}

        
        class QueueUsingLL<T> {
        
            class Node<T> {
                T data;
                Node<T> next;
        
                Node(T data) {
                    this.data = data;
                }
            }
        
            private Node<T> head;
            private Node<T> tail;
            private int size = 0;
        
            public int size() {
                return size;
            }
        
            public boolean isEmpty() {
                if (size == 0) {
                    return true;
                }
                return false;
            }
        
            public T front() throws QueueEmptyException {
                if (size == 0) {
                    QueueEmptyException e = new QueueEmptyException();
                    throw e;
                }
        
                return head.data;
            }
        
            public void enqueue(T element) {
                Node<T> newNode = new Node<T>(element);
        
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
        
                size++;
            }
        
            public T dequeue() throws QueueEmptyException {
                if (head == null) {
                    QueueEmptyException e = new QueueEmptyException();
                    throw e;
                }
                if (head == tail) {
                    tail = null;
                }
                T temp = head.data;
                head = head.next;
                size--;
                return temp;
            }
        }
	   }

       
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static BinaryTreeNode<Integer> takeInput() throws IOException {
		st = new StringTokenizer(br.readLine());
		int rootData = Integer.parseInt(st.nextToken());
		if (rootData == -1) {
			return null;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = Integer.parseInt(st.nextToken());
			if (leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = Integer.parseInt(st.nextToken());
			if (rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}
	
	private static void print(LinkedListNode<Integer> temp)
	{
		while(temp != null){
			System.out.print(temp.data + " ") ;
			temp = temp.next;
		}
		System.out.println();
	}
	


     public static LinkedListNode<Integer> traverseLevel(Queue<BinaryTreeNode<Integer>> queue){
         BinaryTreeNode<Integer> root = queue.poll() ; 
         LinkedListNode<Integer> head = new LinkedListNode<Integer>(root.data) ; 
         while(!queue.isEmpty()){
            BinaryTreeNode<Integer> temp = queue.poll() ;
            head.next = new LinkedListNode<Integer>(temp.data) ; 
         }
         return head ;

     }

        static ArrayList<LinkedListNode<Integer>> ans ; 
       public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        if(root==null)
        {
            return null ;  
        }
    
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>() ; 
        queue.add(root) ; 
        int count = 1 ;
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> temp = queue.poll() ; 

            if(temp.left!=null){
            queue.add(temp.left) ;
                count ++ ;
            }
            if(temp.right!=null){
            queue.add(temp.right) ;
            count ++ ;  
            }

       ans.add(traverseLevel(queue)) ;  
       

        }

        return ans ; 

	}
    

    public static void main(String[] args) throws IOException {
		BinaryTreeNode<Integer> root = takeInput();
		ArrayList<LinkedListNode<Integer>> output = constructLinkedListForEachLevel(root);
		if(output!=null)
		{
			for(LinkedListNode<Integer> head : output){
				print(head);
				
			}
		}
	}
}
