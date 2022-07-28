import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.function.BinaryOperator;
import java.util.zip.Checksum;

import javax.naming.directory.InvalidSearchFilterException;
import javax.xml.crypto.Data;

class QueueEmptyException extends Exception {

}

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}


class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

  class Runner {

	static Queue<Integer> queue = new LinkedList<Integer>() ; 
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if (root==null)
        {
            return;
        }
        
        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
	}
	

	
	

	// private static void printLevelWise(BinaryTreeNode<Integer> root){
	// 	QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
	// 	QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

	// 	primary.enqueue(root);

	// 	while(!primary.isEmpty()){
	// 		BinaryTreeNode<Integer> current=null;
	// 		try {
	// 			current = primary.dequeue();
	// 		} catch (QueueEmptyException e) {
	// 			System.out.println("Not possible");
	// 		}
	// 		System.out.print(current.data + " ");
	// 		if(current.left != null){
	// 			secondary.enqueue(current.left);
	// 		}
	// 		if(current.right != null){
	// 			secondary.enqueue(current.right);
	// 		}
	// 		if(primary.isEmpty()){
	// 			QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
	// 			secondary = primary;
	// 			primary = temp;
	// 			System.out.println();
	// 		}
	// 	}
	// }

	// public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
	// 	//Your code goes here
	// 	if(root==null)
	// 	return 0 ; 
		
		
	// 	int leftHeight = height(root.left) ; 
	// 	int rightHeight = height(root.right);
			
		
	// 	if(root.left!=null && root.right != null){
	// 		return leftHeight + rightHeight +1  ; 
	// 	}
	// 	if(root.left==null && root.right != null){
	// 		diameterOfBinaryTree(root.right) ; 
	// 		return height(root.right) + 1 ; 
	// 	}
	// 	else
	// 	diameterOfBinaryTree(root.left) ; 
	// 	return leftHeight +1  ; 

	// }

	// private static int height(BinaryTreeNode<Integer> root) {
	// 	if(root==null)
	// 	return 0;
		
	// 	int left = height(root.left) ; 
	// 	int right = height(root.right) ; 

	// 	return 1 + Math.max(left, right) ; 

	// }
	// public static void printLevelWise(BinaryTreeNode<Integer> root) {
	// 	//Your code goes here
	// 	if (root==null)
    //     {
    //         return;
    //     }
    //     Queue<BinaryTreeNode<Integer>> queue =new LinkedList<BinaryTreeNode<Integer>>();
    //     queue.add(root);
    //     while(!queue.isEmpty())
    //     {
    //         BinaryTreeNode<Integer> front = queue.poll();
    //         System.out.print(front.data+":");
    //         if (front.left!=null)
    //         {
    //             queue.add(front.left);
    //             System.out.print("L:"+front.left.data);
    //         }
    //         else
    //         {
    //             System.out.print("L:-1");
    //         }
            
    //         if (front.right!=null)
    //         {
    //             queue.add(front.right);
    //             System.out.print(",R:"+front.right.data);
    //         }
    //         else
    //         {
    //             System.out.print(",R:-1");
    //         }
    //         System.out.println();
    //     } 
	// }
	
	// public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
	// 	//Your code goes here
    //     BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0 ,preOrder.length-1, 0, inOrder.length-1);
    // 	return root;

	// }

    // public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder,int siPre, int eiPre, int siIn, int eiIn)
    // {
    // 	if (siPre>eiPre)
    // 	{
    // 		return null;
    // 	}

    // 	int rootData=preorder[siPre];
    // 	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

    // 	int rootIndexInorder=-1;
    // 	for (int i=siIn;i<=eiIn;i++)
    // 	{
    // 		if (rootData==inorder[i])
    // 		{
    // 			rootIndexInorder=i;
    // 			break;
    // 		}
    // 	}

    // 	int siInLeft=siIn;
    // 	int eiInLeft=rootIndexInorder-1;

    // 	int siPreLeft=siPre+1;
    // 	int leftSubTreeLength = eiInLeft - siInLeft + 1;
    // 	int eiPreLeft=(siPreLeft)+(leftSubTreeLength-1);

    // 	int siInRight=rootIndexInorder+1;
    // 	int eiInRight=eiIn;

    // 	int siPreRight=eiPreLeft+1;
    // 	int eiPreRight=eiPre;

    // 	BinaryTreeNode<Integer> leftChild = buildTree(preorder, inorder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
    // 	BinaryTreeNode<Integer> rightChild = buildTree(preorder, inorder, siPreRight, eiPreRight, siInRight, eiInRight);
    // 	root.left=leftChild;
    // 	root.right=rightChild;
    // 	return root;
    // }

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int start = 0;

		String[] nodeDatas = br.readLine().trim().split(" ");

		if (nodeDatas.length == 1) {
			return null;
		}

		int rootData = Integer.parseInt(nodeDatas[start]);
		start += 1;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}

			int leftChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}

			int rightChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}

		return root;
	}


	private static void printLevelWise(BinaryTreeNode<Integer> root){
		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

		primary.enqueue(root);

		while(!primary.isEmpty()){
			BinaryTreeNode<Integer> current=null;
			try {
				current = primary.dequeue();
			} catch (QueueEmptyException e) {
				System.out.println("Not possible");
			}
			System.out.print(current.data + " ");
			if(current.left != null){
				secondary.enqueue(current.left);
			}
			if(current.right != null){
				secondary.enqueue(current.right);
			}
			if(primary.isEmpty()){
				QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
				secondary = primary;
				primary = temp;
				System.out.println();
			}
		}
	}

	// public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
	// 	//Your code goes here
	// 	if(root==null)
	// 	return ; 

	// 	insertDuplicateNode(root.left);
	// 	insertDuplicateNode(root.right);
		
	// 	BinaryTreeNode<Integer> dupNode = new BinaryTreeNode<Integer>(root.data); 

	// 	if(root.left == null)
	// 	root.left = dupNode; 
	// 	else{
	// 		BinaryTreeNode<Integer> temp = root.left ; 
	// 		root.left = dupNode ; 
	// 		dupNode.left = temp ; 
	// 	}
		 
	// 	return ; 
	// }

	// public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
	// 	//Your code goes here
	// 	Pair<Integer,Integer> rootPair = new Pair<Integer, Integer>(-1, -1) ; 
	// 	if(root==null)
	// 	return rootPair ; 

	// 	rootPair.maximum = root.data ; 
	// 	rootPair.minimum = root.data ;

	// 	Pair<Integer, Integer> left = getMinAndMax(root.left) ; 
	// 	Pair<Integer, Integer> right = getMinAndMax(root.right) ; 

	// 	if(left.minimum == -1)
	// 	left.minimum = rootPair.minimum ; 
		
	// 	if(left.minimum < rootPair.minimum)
	// 	rootPair.minimum = left.minimum ; 
		
	// 	if(right.minimum == -1)
	// 	right.minimum = rootPair.minimum ; 
		
	// 	if(right.minimum < rootPair.minimum)
	// 	rootPair.minimum = right.minimum ; 

	// 	if(left.maximum > rootPair.maximum)
	// 	rootPair.maximum = left.maximum ; 

	// 	if(right.maximum > rootPair.maximum)
	// 	rootPair.maximum = right.maximum ;

	// 	return rootPair  ;

	// }

	// public static void pathToLeaf(BinaryTreeNode<Integer> node, int K)
    // {
    //     int path[] = new int[1000];
    //     printPathsRecur(node, path, 0 , K);
    // }
  
    
    // public static void printPathsRecur(BinaryTreeNode<Integer> node, int path[], int pathLen , int K)
    // {
    //     if (node == null)
    //         return;
  
    //     path[pathLen] = node.data;
    //     pathLen++;
  
    //     if (node.left == null && node.right == null)
	// 	checkSum(path,pathLen,K) ; 
    //     else
    //     {
    //         printPathsRecur(node.left, path, pathLen, K);
    //         printPathsRecur(node.right, path, pathLen, K);
    //     }
    // }
  
	// private static void checkSum(int[] path, int pathLen,int K ) {
	// 	int sum = 0 ; 
	// 	for(int i = 0 ; i < pathLen ; i++){
	// 		sum = sum + path[i] ; 
	// 	} 
	// 	if(sum == K)
	// 	 printArray(path, pathLen);
	// }

	// public static void printArray(int ints[], int len)
    // {
    //     int i;
    //     for (i = 0; i < len; i++)
    //     {
    //         System.out.print(ints[i] + " ");
    //     }
    //     System.out.println("");
    // }

	// public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
	// 	//Your code goes here
	// 	pathToLeaf(root,k) ; 
		
	// }

	
	
	// public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	//     //Your code goes here
	// 	if(root==null )
	// 	return ; 

		 
		
	// }
	// public static void pathToNode(BinaryTreeNode<Integer> root, int node, int k)
    // {
    //     int path[] = new int[1000];
    //     printPathsRecur(root, path, 0 , k  , node);
    // }
  
    
    // public static void printPathsRecur(BinaryTreeNode<Integer> node, int path[], int pathLen , int k , int num  )
    // {
    //     if (node == null)
    //         return;
  
    //     path[pathLen] = node.data;
    //     pathLen++;
  
    //     if (node.left.data == num || node.right.data == num)
		
    //     else
    //     {
    //         printPathsRecur(node.left, path, pathLen, K-1);
    //         printPathsRecur(node.right, path, pathLen, K-1);
    //     }
    // }

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if (root == null)
		return true ;
		 
	  if (root.left != null && maxValue(root.left) >= root.data)
		return false ;
		 
	  if (root.right != null && minValue(root.right) <= root.data)
		return false;
	   
	  if (!isBST(root.left) || !isBST(root.right))
		return false;
		 
	  return true;
        	}

	
	private static int minValue(BinaryTreeNode<Integer> root) {
		BinaryTreeNode<Integer> temp = root ; 
		while(temp.left!=null){
			temp = temp.left ; 
		}
		return temp.data; 
	}


	private static int maxValue(BinaryTreeNode<Integer> root) {
		BinaryTreeNode<Integer> temp = root ; 
		while(temp.right!=null){
			temp = temp.right ; 
		} 
		return temp.data ; 
	}

		Queue <BinaryTreeNode<Integer>> queue2 = new LinkedList<BinaryTreeNode<Integer>>() ; 
	

}
