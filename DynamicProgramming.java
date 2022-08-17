import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    return 0 ;
        
	}

    

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            // int n = Integer.parseInt(br.readLine().trim());
            // System.out.println(countMinStepsToOne(n));
            System.out.println(Math.sqrt(41));
    }
}
