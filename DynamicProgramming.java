import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.* ; 
import java.util.stream.IntStream;

import javax.tools.DocumentationTool.Location;

public class DynamicProgramming {

    // public static long staircase(int n) {
	// 	//Your code goes here

    //     if(n<=1)
    //         return 1;
    //     if(n==2)
    //         return 2;

    //     long dpCount[] = new long[n+1];
    //     dpCount[0]=1;
    //     dpCount[1]=1;
    //     dpCount[2]=2;


    //     for (int i=3;i<=n;i++)
    //     {
    //         dpCount[i]=dpCount[i-1]+dpCount[i-2]+dpCount[i-3];

    //     }
    //     return dpCount[n];
	// }

     
    public static int countMinStepsToOne(int n) {
		//Your code goes here
      
        if (n==0 || n==1)
        return 0;
    else if (n==2 || n==3)
        return 1;
    
    int[] dp = new int[n+1];
    for (int i=0;i<n+1;i++)
        dp[i]=-1;
    
    //Setting base cases
    dp[1]=0;
    dp[2]=1;
    dp[3]=1;
    for (int i=4;i<=n;i++)
    {
        //System.out.println("Current i: "+i);
        int ans1=dp[i-1];
        int ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
        if (i%2==0)
        {
            ans2=dp[i/2];
        }
        if (i%3==0)
        {
            ans3=dp[i/3];
        }
        //System.out.println("ans1: "+ans1+", ans2: "+ans2+", ans3: "+ans3);
        dp[i]=Math.min(ans1,Math.min(ans2,ans3))+1;
        //System.out.println(i+": "+dp[i]);
    }
    return dp[n];

       } 
	
       public static int minCount(int n) {
		//Your code goes here
        int dp[] = new int[n+1];
        for (int i=0;i<n+1;i++)
            dp[i]=-1;
        
        return minCountHelper(n,dp);
	}
    
    private static int minCountHelper(int n, int[] dp)
    {
        if (n==0)
            return 0;
        
        int minVal = Integer.MAX_VALUE;
        for (int i=1;i*i<=n;i++)
        {
            if (dp[n-(i*i)]==-1)
                dp[n-(i*i)]=minCountHelper(n-(i*i),dp);
            int currVal = dp[n-(i*i)];
            if (currVal<minVal)
                minVal=currVal;
        }
        
        return minVal+1;
    }
         

    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
      
        if(n <= 4){
            return n ;
        }
        Long max = memo.get(n) ; 
        if(max != null)
        return max ;

        long coin1 = bytelandian(n/2, memo) ; 
        long coin2 = bytelandian(n/3, memo) ; 
        long coin3 = bytelandian(n/4, memo) ; 

        long total = coin1 + coin2  + coin3 ; 

        max = total > n  ? total : n ; 
        memo.put(n, max) ; 

        return max ;
	}

    private static int[] trim(int[] houses){
        int temp [] = new int[houses.length -1] ; 
        for(int i = 0 ; i < temp.length ; i++ ){
            temp[i] = houses[i] ;
        }
        return temp ; 
    }
	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
      
        if(houses.length==1)
        return houses[0] ;

        int []dp = new int [houses.length] ; 
        for(int  i = 0 ; i < dp.length ; i++){
            dp[i] = -1 ; 
        }

        dp[dp.length - 1] = houses[houses.length - 1] ; 
       // System.out.println(dp[dp.length - 1]);
        dp[dp.length - 2] = houses[houses.length - 2] ; 
        //System.out.println(dp[dp.length - 2]);


       
       for(int i = dp.length - 3 ; i >= 0 ; i-- ){
        
            dp[i] = houses[i] + dp[i+2] ;   
                  
       }

       Arrays.sort(dp);
       return dp[dp.length - 1 ] ; 
	}

   
	public static int minCostPath(int[][] input) {
		//Your code goes here
       
        
        int minCost = minCostPathHelper(input,0,0) ; 
        return minCost ; 
	}

    private static int  minCostPathHelper(int[][] input,int i, int j ) {
        
        int m  = input.length ; 
        int n = input[0].length ; 
       
        if(i ==m-1 && j==n-1){
            return input[i][j] ; 
        }
        if(i >= m || j >= n){
            return Integer.MAX_VALUE ;
        }

        System.out.println("before ans1 call : " + i + " " +  j );
        int ans1 = minCostPathHelper(input, i+1, j) ; 
        
        System.out.println("before ans2 call : " + i + " " + j );
        int ans2 = minCostPathHelper(input, i, j+1) ; 
        
        System.out.println("before ans3 call : " + i + " " + j );
        int ans3 = minCostPathHelper(input, i+1, j+1) ; 

       int myAns = input[i][j] + Math.min(ans1 , Math.min(ans2, ans3)) ; 
       return myAns ; 
    }

    
	public static int lcs(String s, String t) {
		//Your code goes here
        if(s.length()==0 || t.length()==0)
        return 0 ; 

       int ans = 0 ; 

        if(s.charAt(0)==t.charAt(0)) {
            ans = 1 + lcs(s.substring(1), t.substring(1)) ; 
        }
        else {
            int ans1 = lcs(s.substring(1), t) ; 
            int ans2 = lcs(s, t.substring(1)) ; 
            ans = Math.max(ans1, ans2) ;  
        }

        return ans ; 
    }
    
 


    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
      return   knapsackI(maxWeight, values, weights) ;
        
	}

    public static int knapsackI(int W, int val[], int wt[])  {

		int n = val.length;
		int[][] dp = new int[n+1][W+1];

		for(int i=n-1; i>=0; i--) {
		for(int w=0;w<=W;w++) {

			int ans;
			if(wt[i] <= w) {
				int ans1 = val[i] + dp[i+1][w-wt[i]];
				int ans2 = dp[i+1][w];
				ans = Math.max(ans1, ans2);
			}else{
				ans = dp[i+1][w];
			}
		dp[i][w] = ans;
				}
			}		

			return dp[0][W];
}


    // static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // public static int[] takeInput() throws IOException {
	// 	int n = Integer.parseInt(br.readLine().trim());

	// 	if (n == 0) {
	// 		return new int[0];
	// 	}

	// 	String[] strNums = br.readLine().trim().split("\\s");
    //     int[] arr = new int[n];

    //     for (int i = 0; i < n; i++) {
	// 		arr[i] = Integer.parseInt(strNums[i]);
    //     }

    //     return arr;
	// }

    // public static void main(String[] args) throws NumberFormatException, IOException {
    //         int[] arr = takeInput();
    //         System.out.println(maxMoneyLooted(arr));
    // }

    




    // static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // public static int[][] take2DInput() throws IOException {
    //     String[] strRowsCols = br.readLine().trim().split("\\s");
    //     int mRows = Integer.parseInt(strRowsCols[0]);
    //     int nCols = Integer.parseInt(strRowsCols[1]);

    //     if (mRows == 0) {
    //         return new int[0][0];
    //     }


    //     int[][] mat = new int[mRows][nCols];

    //     for (int row = 0; row < mRows; row++) {
    //         String[] strNums; 
    //         strNums = br.readLine().trim().split("\\s");
            
    //         for (int col = 0; col < nCols; col++) {
    //             mat[row][col] = Integer.parseInt(strNums[col]);
    //         }
    //     }

    //     return mat;
    // }

    

    class Input {
        private int n;
        private int[] weights;
        private int[] values;
        private int maxWeight;
    
        public Input(int[] weights, int[] values, int n, int maxWeight) {
            this.n = n;
            this.weights = weights;
            this.values = values;
            this.maxWeight = maxWeight;
        }
    
        public int getSize() {
            return this.n;
        }
    
        public int[] getWeights() {
            return this.weights;
        }
    
        public int[] getValues() {
            return this.values;
        }
    
        public int getMaxWeight() {
            return this.maxWeight;
        }
    }
    
     
    
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        public static Input takeInput() throws NumberFormatException, IOException {
            
            int n = Integer.parseInt(br.readLine().trim());
    
            if (n == 0) {
                return (new Input(new int[0], new int[0], 0, 0));
            }
    
            String[] strWeights = br.readLine().trim().split(" ");
            String[] strValues = br.readLine().trim().split(" ");
            int maxWeight = Integer.parseInt(br.readLine().trim());
    
            int[] weights = new int[n];
            int[] values = new int[n];
    
            for (int i = 0; i < n; i++) {
                weights[i] = Integer.parseInt(strWeights[i]);
                values[i] = Integer.parseInt(strValues[i]);
            }
    
            return (new Input(weights, values, n, maxWeight));
    
        }
    
        public static void main(String[] args) throws NumberFormatException, IOException {
            
            Input input = takeInput();
    
            int n = input.getSize();
            int[] weights = input.getWeights();
            int[] values = input.getValues();
            int maxWeight = input.getMaxWeight();
    
            
            System.out.println(knapsack(weights, values, n, maxWeight));
        
    }
 
}
