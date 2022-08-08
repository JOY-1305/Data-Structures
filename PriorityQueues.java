import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class PriorityQueues {
    // public static void inplaceHeapSort(int arr[]) {
	// 	/* Your class should be named Solution
	// 	* Don't write main().
	// 	* Don't read input, it is passed as function argument.
	// 	* Change in the given input itself.
	// 	* Taking input and printing output is handled automatically.
	// 	*/
	// 	int n=arr.length;
	// 	for(int i=(n/2)-1;i>=0;i--)
	// 	{
	// 		downHeapify(arr,i,n);
	// 	}
		
	// 	for(int i=n-1;i>=0;i--)
	// 	{
	// 		int temp=arr[i];
	// 		arr[i]=arr[0];
	// 		arr[0]=temp;
			
	// 		downHeapify(arr,0,i);
	// 	}
	// }
    
	// private static void downHeapify(int[] arr, int i, int n)
	// {
	// 	int parentIndex=i;
	// 	int leftChildIndex=2*parentIndex+1, rightChildIndex=2*parentIndex+2;
		
	// 	while(leftChildIndex<n)
	// 	{
	// 		int minIndex=parentIndex;
	// 		if(arr[minIndex]>arr[leftChildIndex])
	// 			minIndex=leftChildIndex;
			
	// 		if(rightChildIndex<n && arr[minIndex]>arr[rightChildIndex])
	// 			minIndex=rightChildIndex;
			
	// 		if(minIndex==parentIndex)
	// 			return;
			
	// 		int temp=arr[parentIndex];
	// 		arr[parentIndex]=arr[minIndex];
	// 		arr[minIndex]=temp;
			
	// 		parentIndex=minIndex;
	// 		leftChildIndex=2*parentIndex+1;
	// 		rightChildIndex=2*parentIndex+2;
			
	// 	}
	// }

	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
	PriorityQueue<Integer> pq = new PriorityQueue<Integer> () ; 
		
	}
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		System.out.println(buyTicket(input, k));
	}
}
