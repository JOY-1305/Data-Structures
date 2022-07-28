import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.lang.Math;
import javax.lang.model.util.ElementScanner14;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
            

public class LinkedList {
//     public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
// 		//Your code goes here
//         LinkedListNode<Integer> temp = new LinkedListNode<>(data) ;
//         LinkedListNode<Integer> tempHead = head ; 

//         if(pos==0){
//             temp.next = tempHead ; 
//             head = temp ; 
//         }
//         else{
//         int count = 1 ; 
//         while(tempHead!=null){
//             if(count != pos){
//                 count+=1 ;
//                 tempHead = tempHead.next ; 
//             }
//             else if(count==pos){
//                 LinkedListNode<Integer> temp1 = tempHead.next ;
//                 tempHead.next = temp ; 
//                 temp.next = temp1 ; 
//                 break ; 
//             }
//     }
  
// }
// return head ; 

// public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
//     // Write your code here.
//     LinkedListNode<Integer> tempHead = head ; 
    
//     if(pos == 0 )
//     head = head.next ; 

//     else  {
//         int count = 1 ;
//         while(tempHead!=null){
//             if(tempHead.next==null)
//             break ; 
//             if(pos == count ){
//                 LinkedListNode<Integer> temp1 = tempHead.next  ;
//                 tempHead.next = temp1.next; 
//                 break ; 
//             }
//             count+=1 ; 
//             tempHead = tempHead.next ; 
//         }

//     }
//     return head ; 

// }

// public static int findNode(LinkedListNode<Integer> head, int n) {
//     // Write your code here.
//     int count = 0 ; 
//     LinkedListNode<Integer> tempHead = head ; 
//     int flag = 0 ;
//     while(tempHead!=null){
//         if(tempHead.data == n ){
//             flag = 1 ; 
//         break ; 
//         }
//         else{
//             count=count+1 ; 
//             tempHead = tempHead.next ; 
//         }
//     }
//      if(flag == 1)
//      return count ;

//      else 
//      return -1 ; 
// }
// static int cntNodes(LinkedListNode<Integer> node)
//     {
//         if (node == null)
//             return 0;
 
//         return (1 + cntNodes(node.next));
//     }

// public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
//     //Your code goes here
//     int cnt = cntNodes(head);
 
//     if (cnt != n && n < cnt) {
//         int skip = cnt - n;
//         LinkedListNode<Integer> prev = null;
//         LinkedListNode<Integer> curr = head;

//         while (skip > 0) {
//             prev = curr;
//             curr = curr.next;
//             skip--;
//         }

//         prev.next = null;
//         LinkedListNode<Integer> tempHead = head;
//         head = curr;

//         while (curr.next != null)
//             curr = curr.next;
     
//         curr.next = tempHead;
// }
//         return head ; 
// }
                    
// public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
//     //Your code goes here
//     LinkedListNode<Integer> temp = head ; 

//     while(temp!=null){
//         if(temp.next == null)
//             break ; 
//         if(temp.data == temp.next.data){
//             LinkedListNode<Integer> temp2 = temp.next ; 
//             temp2 = temp.next ;
//             temp.next = temp2.next ;  
//         }
//         else 
//         temp = temp.next ; 
//     }
//     return head ;
// }

// public static void printReverse(LinkedListNode<Integer> root) {
//     //Your code goes here
//     LinkedListNode<Integer> prev = null;
//     LinkedListNode<Integer> current = root;
//     LinkedListNode<Integer> next = null;
//     while (current != null) {
//         next = current.next;
//         current.next = prev;
//         prev = current;
//         current = next;
//     }
//     root = prev;
//     print(root);
//     }  
// public static boolean isPalindromeUtil(LinkedListNode<Integer> right, LinkedListNode<Integer> head)
// {
//    LinkedListNode<Integer> left = head;
 
//     if (right == null)
//         return true;
 
//     boolean isp = isPalindromeUtil(right.next,head);
//     if (isp == false)
//         return false;
 
//     boolean isp1 = (right.data == left.data);
 
//     left = left.next;
 
    
//     return isp1;
// }
// public static boolean isPalindrome(LinkedListNode<Integer> head) {

//     boolean result = isPalindromeUtil(head , head);
//     return result;
    //Your code goes here
    // if(head.next==null)
    // return true ;
    

    // LinkedListNode<Integer> start = head ; 
    // LinkedListNode<Integer> root = head ; 
    // LinkedListNode<Integer> prev = null;
    // LinkedListNode<Integer> current = root;
    // LinkedListNode<Integer> next = null;
    
    // while (current != null) {
    //     next = current.next;
    //     current.next = prev;
    //     prev = current;
    //     current = next;
    // }
    // root = prev;
    
    // while(start!=null ){
    //     if(start.data != root.data)
    //     check = false ; 
    //     else 
    //     check = true ; 
    //     start = start.next ;
    //     root = root.next ;

    // }

    // return check ;
//}

// static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
//     public static LinkedListNode<Integer> takeInput() throws IOException {
//         LinkedListNode<Integer> head = null, tail = null;

//         String[] datas = br.readLine().trim().split("\\s");

//         int i = 0;
//         while(i < datas.length && !datas[i].equals("-1")) {
//             int data = Integer.parseInt(datas[i]);
//             LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
//             if(head == null) {
//                 head = newNode;
//                 tail = newNode;
//             }
//             else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//             i += 1;
//         }

//         return head;
//     }
    
    // public static void print(LinkedListNode<Integer> head){
    //     // while(head != null) {
    //     //     System.out.print(head.data + " ");
    //     //     head = head.next;
    //     // }
        
    //     // System.out.println();
    // }

// static int posCount = 0;
// public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
//     //Your code goes here
//     if(pos==0){
//         head = head.next ; 
//         return head ; 
//     }
//     if(head == null || posCount == pos || head.next == null)
//     return head ; 

//     if(posCount==pos-1){
//         LinkedListNode<Integer> temp1 ; 
//         LinkedListNode<Integer> temp2 ; 
//         temp1 = head.next ; 
//         temp2 = temp1.next ; 
//         head.next = temp2 ;
//         return head ;
//     }
//     else{
//     posCount+=1 ;
//     head.next = deleteNodeRec(head.next, pos) ;
//     return head ;
// }
// }
// static LinkedListNode<Integer> tempHead ;
// public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
  
//     if (head==null || head.next==null)
//     {
//         return head;
//     }
//     LinkedListNode<Integer> temp1=reverseLinkedListRec(head.next);
//     LinkedListNode<Integer> temp2=temp1;
//     while (temp2.next!=null)
//     {
//         temp2=temp2.next;
//     }
//     temp2.next=head;
//     head.next=null;
//     return temp1;

// }


// public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
//     /* Your class should be named Solution
//      * Don't write main().
//      * Don't read input, it is passed as function argument.
//      * Return output and don't print it.
//       * Taking input and printing output is handled automatically.
//     */
//     LinkedListNode<Integer> prev = null;
//     LinkedListNode<Integer> current = head;
//     LinkedListNode<Integer> next = null;
//     while (current != null) {
//         next = current.next;
//         current.next = prev;
//         prev = current;
//         current = next;
//     }
//     head = prev;
//     return head;
// }

// public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
//     //Your code goes here
//     if (head1==null)
//         {
//             return head2;
//         }
        
//         if (head2==null)
//         {
//             return head1;
//         }
        
//         LinkedListNode<Integer> newHead=null,node1=head1,node2=head2,newNode=null;
//         int data1=node1.data,data2=node2.data;
//         if (data1<data2)
//         {
//             newHead=node1;
//             node1=node1.next;
//         }
//         else
//         {
//             newHead=node2;
//             node2=node2.next;
//         }
//         newNode=newHead;
//         while(node1!=null && node2!=null)
//         {
//             data1=node1.data;
//             data2=node2.data;
//             if (data1<data2)
//             {
//                 newNode.next=node1;
//                 newNode=newNode.next;
//                 node1=node1.next;
//             }
//             else
//             {
//                 newNode.next=node2;
//                 newNode=newNode.next;
//                 node2=node2.next;
//             }
//         }
        
//         while(node1!=null)
//         {
//             newNode.next=node1;
//             newNode=newNode.next;
//             node1=node1.next;
//         }
//         while (node2!=null)
//         {
//             newNode.next=node2;
//             newNode=newNode.next;
//             node2=node2.next;
//         }
//         return newHead;
    
// }

// public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
//     //Your code goes here
//     LinkedListNode<Integer> temp = head ; 
//     int count = 0  ;
    
//     if(head==null)
//         return head ; 
    
//     while(temp.next!=null){
//         count++ ; 
//         temp = temp.next ;
//     }
//     int midPoint  = count%2 ; 
//     if(midPoint==0){
//         count= count/2 ; 
//     }
//     else {
//         count = (count/2) + 1 ; 
//     }
//     for(int i = 1  ; i < count ; i++){
//         head = head.next ; 
//     }
//     return head ;
// }


// public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
//     if (head==null || head.next==null)
//         {
//             return head;
//         }
//         LinkedListNode<Integer> midNode=midPoint(head),part1Head=head,part2Head=null;
//         part2Head=midNode.next;
//         midNode.next=null;
//         LinkedListNode<Integer> head1=mergeSort(part1Head);
//         LinkedListNode<Integer> head2=mergeSort(part2Head);
//         LinkedListNode<Integer> newHead=mergeTwoSortedLinkedLists(head1,head2);
//         return newHead;
	
// }

// public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
//     //Your code goes here
//     LinkedListNode<Integer> temp = head ; 
//     int count = 0  ;
    
//     if(head==null)
//         return head ; 
    
//     while(temp.next!=null){
//         count++ ; 
//         temp = temp.next ;
//     }
//     int midPoint  = count%2 ; 
//     if(midPoint==0){
//         count= count/2 ; 
//     }
//     else {
//         count = (count/2) + 1 ; 
//     }
//     for(int i = 1  ; i < count ; i++){
//         head = head.next ; 
//     }
//     return head ;
// }

//  public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
//      LinkedListNode<Integer> temp = head , delNode ; 
// 		//Your code goes here
//         while(temp!=null){

//             for(int i = 0 ; i < M - 1; i++){
//                 temp = temp.next ;  
//             }
//            delNode = temp.next ;
//            for(int  i = 0 ; i < N && delNode!=null ; i++  ){
//                delNode = delNode.next ;
//            } 
//            temp.next = delNode ;
//            temp = delNode ;  
//         }
//         return head  ;
// 	}

// public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
//     //Your code goes here
//     LinkedListNode<Integer> tempHead = head, temp_i = null, temp_j = null ;  
//     int pos_i = 0, pos_j = 0 , tempData = 0 ;
//     int size = getSize(head) ; 
//     System.out.println(size);
//     if(size < j || size < i ){
//         return head ; 
//     }
//    while(tempHead.next!=null){
//     if(pos_i == i){
//         temp_i = tempHead ; 
//     }
//     if(pos_j == j){
//         temp_j = tempHead ; 
//     }
//     pos_i++ ;
//     pos_j++ ;
//     tempHead = tempHead.next ;
//    }
//    tempData = temp_i.data; 
//    temp_i.data = temp_j.data  ;
//    temp_j.data = tempData ; 
    
//    return head ;

// }

// public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
//     //Your code goes here

//     if (head==null || head.next==null)
//     {
//         return head;
//     }
//     LinkedListNode<Integer> smallerHead=reverseLinkedListRec(head.next);
//     LinkedListNode<Integer> node=smallerHead;
//     while (node.next!=null)
//     {
//         node=node.next;
//     }
//     node.next=head;
//     head.next=null;
//     return smallerHead;
// }

// public static LinkedListNode<Integer> findTail(LinkedListNode<Integer> head, int k)
// {
//         for (int i=0;i<k && head.next!=null;i++)
//         {
//             head=head.next;
//         }
//         return head;


// }

// public static int findLength(LinkedListNode<Integer> head)
// {
//     int count=0;
//     while(head.next!=null)
//     {
//         head=head.next;
//         count=count+1;
//     }
//     return count;
// }

// public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
//     //Your code goes here
//     if (head==null || k==0 || k==1)
//     {
//         return head;
//     }
//     else if (k>findLength(head))
//     {
//         return reverseLinkedListRec(head);
//     }

//     LinkedListNode<Integer> node=head,nextNode=null,tail=null,prevTail=null,newHead=null;
//     while(node!=null)
//     {
//         tail=findTail(node,k-1);
//         nextNode=tail.next;
//         tail.next=null;
//         newHead=reverseLinkedListRec(node);
//         //Runner.print(newHead);
//         if (node==head)
//         {
//             tail=head;
//             tail.next=nextNode;
//             head=newHead;

//         }
//         else
//         {
//             tail=node;
//             tail.next=nextNode;
//             prevTail.next=newHead;

//         }
//         node=nextNode;
//         prevTail=tail;
//         //Runner.print(head);

//     }
//     return head;


// }

// public static int findLengthLL(LinkedListNode<Integer> head)
// {
//     int count=0;
//     while(head.next!=null)
//     {
//         head=head.next;
//         count=count+1;
//     }
//     return count;

// }

// public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
//     //Your code goes here
//     if (head==null || head.next==null)
//     {
//         return head;
//     }
//     int n=findLengthLL(head);
//     LinkedListNode<Integer> node1=null,node2=null,temp=null;
//     int data1=0,data2=0;
//     for (int i=0;i<n;i++)
//     {
//         node1=head;
//         node2=head.next;
//         for (int j=0;j<n-i;j++)
//         {
//             data1=node1.data;
//             data2=node2.data;
//             if (data1>data2)
//             {
//                 node1.data=data2;
//                 node2.data=data1;
//             }
//             node1=node1.next;
//             node2=node2.next;
            
//         }
//     }
//     return head;
    
// }

// static LinkedListNode<Integer> newNode(int data)
//     {
//         LinkedListNode<Integer> new_node = new LinkedListNode<Integer>(data) ;  
//         new_node.next = null;
//         return new_node;
//     }

// public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
//     LinkedListNode<Integer> prev = null;
//     LinkedListNode<Integer> current = head;
//     LinkedListNode<Integer> next = null;
//         while (current != null) {
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }
//         return prev;
// }

// public static LinkedListNode<Integer> addOne(LinkedListNode<Integer> head) {

//   //  Queue<Integer> queue = new LinkedList<Integer> ;
//   LinkedListNode<Integer> tempHead = head ; 
//   LinkedListNode<Integer> temp  = null ; 
//   LinkedListNode<Integer> prev = null ; 
//   int carry = 1, sum;
//   while(head != null){
//       sum = carry + head.data ; 
//       carry = (sum >= 10) ? 1 : 0 ;
//       sum = sum%10 ; 
//       head.data = sum ; 
//       temp= head ; 
//       head=head.next ; 
//   }
//   if(carry > 0)
//       temp.next = newNode(carry) ; 
      
//       return tempHead ; 
  
// }
// public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head){
//     head = reverseLL(head);
//     head = addOne(head);
//     return reverseLL(head) ; 
// }
 
// public static void deleteAlternateNodes(Node<Integer> head) {
//     //Your code goes here
//     Node<Integer> temp = head ;
//     Node<Integer> temp2 = head;

//     while(temp.next!=null){
//         temp2 = temp.next ;
//         temp2 = temp2.next ; 
//         temp.next = temp2 ;  
//     }
// }


// static Scanner s = new Scanner(System.in);

// public static void main(String[] args) {

//     Node<Integer> list = input();
//     deleteAlternateNodes(list);
//     print(list);
// }

// public static void print(Node<Integer> head) {
//     while (head != null) {
//         System.out.print(head.getData() + " ");
//         head = head.next;
//     }
// }

// public static Node<Integer> input() {
//     int data = s.nextInt();

//     Node<Integer> head = null;
//     Node<Integer> tail = null;
//     while (data!=-1) {
//         Node<Integer> newNode = new Node<Integer>(data);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             tail = newNode;
//         }
//         data = s.nextInt();
//     }
//     return head;
// }

public static int height(BinaryTreeNode<Integer> root){
    if(root==null)
        return 0 ;
       
    int left = height(root.left) ; 
    int right = height(root.right) ; 
    
    return 1 + Math.max(left, right) ; 
}
public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
    //Your code goes here
    if(root==null)
        return 0 ; 
     int leftHeight = height(root.left);
    int rightHeight = height(root.right) ;
    int diameter  = abs(leftHeight - rightHeight ) ; 
    
    
}

}
    

