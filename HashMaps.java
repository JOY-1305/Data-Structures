import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.util.*;
public class HashMaps {

    // public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
    //     if (size==0)
    //         return 0;
        
    //     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>() ; 
    //     int count = 0 ; 
    //     for(int key:input)
    //     {	
    //         if(map.containsKey(key))
    //     	{
    //         	map.put(key,map.get(key)+1);
    //     	}
    //         else
    //         {
    //             map.put(key,1);
    //         }
    //     }
    //     int num = 0 ; 
        
    //     for(Integer i:map.keySet()){
    //         if(map.containsKey(i*-1) && i > 0){
    //             int val1 = map.get(-i) ; 
    //             int val2 = map.get(i) ; 
    //             num = num + (val1*val2) ; 
    //         }
    //         if(map.containsKey(i) && i==0)
    //             num = zeroSum(map.get(i)) ; 
    //     }
    //     return num ; 
	// }
    
    // private static int zeroSum(int  num ) {
    //     int sum = 0 ; 
    //     for(int  i = 1 ; i < num ; i++ ){
    //         sum = sum+i ;  
    //     }
    //     return sum ; 
    // }

    
	// public static String uniqueChar(String str){
	// 	/* Your class should be named Solution
	// 	 * Don't write main().
	// 	 * Don't read input, it is passed as function argument.
	// 	 * Return output and don't print it.
	//  	 * Taking input and printing output is handled automatically.
	// 	*/
    //     HashMap<Character, Integer> map = new HashMap<Character, Integer>() ;
    //     for(int i = 0 ; i < str.length() ; i++ ){
    //         if(map.containsKey(str.charAt(i))){
    //             map.put(str.charAt(i), map.get(str.charAt(i))+1) ; 
    //         }
    //         else
    //         map.put(str.charAt(i), 1) ;
    //     }

    //     String output = new String() ; 
    //     output = " " ;
    //     for(Character s : map.keySet()){
    //         output = output + s ;
    //         System.out.println(output);
    //     }
    //         return output ; 
	//     }
    
    static int [] subsetSums(Integer[] sumNeg2, int n)
    {
        int [] sumNeg = new int[sumNeg2.length] ; 
        int total = 1 << n;
 
        for (int i = 0; i < total; i++) {
            int sum = 0;
 
            
            for (int j = 0; j < n; j++){
                if ((i & (1 << j)) != 0)
                    sum += sumNeg2[j];
                    sumNeg[j] = sum ;  
            }
           
        }
        return sumNeg ; 
    }

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here

        Arrays.sort(arr);
        ArrayList<Integer> negative = new ArrayList<Integer>() ; 

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0)
            negative.add(arr[i]) ; 
        }
        int size = negative.size() ; 
        int neg[] =new int[size] ;
        Integer[] sumNeg = (Integer[]) negative.toArray() ; 
        neg = subsetSums(sumNeg, size) ;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>() ;
        for(int i = 0 ; i < neg.length ; i++){
            if(map.containsKey(neg[i]))
            map.put(neg[i], map.get(neg[i] + 1)) ; 

            else
            map.put(neg[i], 1) ; 
        }
        int max = Integer.MIN_VALUE ; 
        for(int i : arr){
            if( i > 0 && map.containsKey(-i))
            if(i > max){
                max = i ; 
            }
        }

        
	}

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
	}
}
class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException {

          if(isEmpty()){
            throw new PriorityQueueException();
        }
        int minEle=getMin();
        
        heap.set(0,heap.get(heap.size()-1));
        
        heap.remove(heap.size()-1);
        
        int parentIndex=0;
        int leftChildIndex=2*parentIndex+1,rightChildIndex=2*parentIndex+2;
        while(leftChildIndex < heap.size())
        {
            int minIndex=parentIndex;
            
            if(heap.get(minIndex) > heap.get(leftChildIndex))
            {
                minIndex=leftChildIndex;
            }
            
            if(rightChildIndex < heap.size())
            {
                if(heap.get(minIndex) > heap.get(rightChildIndex))
            	{
                	minIndex=rightChildIndex;
            	}
            }
            
            if(minIndex == parentIndex)
            {
                return minEle;
            }
            
            int temp=heap.get(parentIndex);
            heap.set(parentIndex,heap.get(minIndex));
            heap.set(minIndex,temp);
            
            parentIndex=minIndex;
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        }
        return minEle;
	}
}

class PriorityQueueException extends Exception {

}