import  java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test1 {
    // public static boolean checkSequence(String a, String b) {

    // if(b.length()==0)
    //     return true;
     
    // if(a.length() == 0)
    //     return false;
     
    // if(a.charAt(0) == b.charAt(0))
    //     return checkSequence(a.substring(1), b.substring(1));
    // else
    //     return checkSequence(a.substring(1), b);
        

	// }

    // public static int maximumProfit(int budget[]) {
	// 	// Write your code here

    //     int ans = Integer.MIN_VALUE;
    //     int price = 0 ;
    //     int subs = 0 ; 

    //      Arrays.sort(budget);
         
    //      int N = budget.length;
 
         
    //      for (int i = 0; i < N; i++) {

    //          int count = (N - i);
  
    //          if (ans < count * budget[i]) {
    //              price = budget[i];
    //              ans = count * budget[i];
    //          }
    //      }

    //      for(int i = 0 ; i < budget.length ; i++ ){
    //         if(price <= budget[i])
    //          subs++ ;
    //      }
  
    //      return price*subs;
	// }



   // public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
   //     return helper(input,input.length, 0, 0, 0); 
	//}

    
	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        int count = 0  ; 
    for(int i=0;i<arr.length;i++)
{ 
    for(int j=i+1;j<arr.length;j++)
    {
     
      
        if(arr[i]+arr[j]==num)
        {
            count ++ ; 
            
        }
    }
}
     return count ;    
}
    public static int tripletSum(int[] arr, int num) {
		//Your code goes here

        int s = 0 , l = arr.length-1 ;
        int count = 0 ; 
        for(int i = 0 ; i < arr.length ; i++)
        {
            int diff1 = num - arr[i] ; 
           for(int  j = i+1; j < arr.length ; j ++) {
            int [] temp = new int [arr.length - j ];
            for(int k = 0 ; k < temp.length ; k++){
                temp[k] = arr[k+i];
            }
            int num2 = pairSum(temp, diff1) ;
            count = num2 ; 
           }
            count = count + 1 ; 
        }
    
        return count ; 

	}    
    	
    // public static void main(String[] args) {
        
	// 	Scanner s = new Scanner(System.in);
    //     int n  = s.nextInt(); 

		// String large = s.nextLine();
		// String small = s.nextLine();

		// System.out.println(checkSequence(large, small));
        
    //    
    // int n = s.nextInt();
	// 	int input[] = new int[n];
	// 	for(int i = 0; i < n; i++) {
	// 		input[i] = s.nextInt();
	// 	}
	//	System.out.println(splitArray(input));

  
//	}

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
public static int[] takeInput() throws IOException {
    int size = Integer.parseInt(br.readLine().trim());
    int[] input = new int[size];

    if (size == 0) {
        return input;
    }
    
    String[] strNums; 
    strNums = br.readLine().split("\\s");
    

    for (int i = 0; i < size; ++i) {
        input[i] = Integer.parseInt(strNums[i]);
    }

    return input;
}

public static void printArray(int[] arr) {
    for (int element : arr) {
        System.out.print(element + " ");
    }

    System.out.println();
}

public static void main(String[] args) throws NumberFormatException, IOException {
    int t = Integer.parseInt(br.readLine().trim());

    while(t > 0) {

        int[] arr = takeInput();
        int num = Integer.parseInt(br.readLine().trim());
        System.out.println(pairSum(arr, num));

        t -= 1;
    }
}
    
    }

    class Student{
        public abstract double numberOfStudent();
    }
