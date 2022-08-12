import java.util.* ; 

public class Recusion {

    public static String getOptions(int digit) {
        if (digit == 2) {
        return "abc";
        }
        if (digit == 3) {
        return "def";
        }
        if (digit == 4) {
        return "ghi";
        }
         if (digit == 5) {
        return "jkl";
        }
        if (digit == 6) {
        return "mno";
        }
        if (digit == 7) {
        return "pqrs";
        }

        if (digit == 8) {
        return "tuv";
        }
         if (digit == 9) {
        return "wxyz";
        }
        return "";
        }

        public static String[] keypad(int input) {
        if(input == 0)
        {
        String[] output = new String[1];
        output[0] = "";
        return output;
        }

        String [] smallOutput = keypad(input/10);
        int key = input%10;
        String smallString = getOptions(key);
        String[] output = new String [smallOutput.length * smallString.length()];
        int k = 0;
        
        for(int i=0; i<smallOutput.length;i++){
            for(int j=0; j<smallString.length();j++)
                {
                    output[k] = smallOutput[i] + smallString.charAt(j);
                    k++;    
                }
        }
        
        return output;
        
    }
        
    public static void printSubsequences(String str){
        if(str == null){
            return  ; 
        }
        System.out.println(str);
        char ch = str.charAt(0);
        System.out.println(ch);
        if(str.charAt(1)!=0){
        for(int i = 1 ; i < str.length() ; i++){
            System.out.println(ch + str.charAt(i));
        }
    }
    printSubsequences(str.substring(1));
    }

    
    public static String[] returnSubsequences( String str ){
      if(str.length() == 0 ){
        String[] output = new String[1] ; 
        output[0] = "" ; 
        return output ; 
      }
        
      String[] smallOutput = returnSubsequences(str.substring(1)) ; 
      String[] output = new String[smallOutput.length*2] ; 
      for(int i = 0 ; i < smallOutput.length ; i++ ){
        output[i] = smallOutput[i] ; 
      }
      for(int i = 0 ; i < smallOutput.length ; i++ ){
        output[i + smallOutput.length] = str.charAt(0) + smallOutput[i] ; 
      }

      return output ; 
    }

    public static void main (String []args){
        Scanner s = new Scanner(System.in) ; 
        String str = s.next() ; 
        printSubsequences(str) ; 
   
    }


    public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		int[][] output = subsetsSumKHelper(input,k,0);
        for (int i=0;i<output.length;i++)
        {
            int[] arr = output[i];
            for (int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
	}
    
    
    private static int[][] subsetsSumKHelper(int input[], int k, int startIndex)
    {
        
        if (startIndex==input.length)
        {
            int arr[][];
            if (k==0)
            {
                 arr = new int[1][0];
            }
            else
            {
                arr = new int[0][0];
            }
            return arr;
        }
        
       
        int temp1[][] = subsetsSumKHelper(input,k-input[startIndex],startIndex+1);
        int temp2[][] = subsetsSumKHelper(input,k,startIndex+1);
        
      
        int output[][] = new int[temp1.length+temp2.length][];
        for (int i=0;i<temp2.length;i++)
        {
            output[i] = new int[temp2[i].length];
            for (int j=0;j<temp2[i].length;j++)
            {
                output[i][j]=temp2[i][j];
            }
        } 
        
        for (int i=0;i<temp1.length;i++)
        {
            output[i+temp2.length] = new int[temp1[i].length+1];
            output[i+temp2.length][0] = input[startIndex];
            for (int j=1;j<output[i+temp2.length].length;j++)
            {
                output[i+temp2.length][j]=temp1[i][j-1];
            }
        }
        
        return output;
    }

    static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

    public static void permutations(String input){
        permutationsHelper(input,"");

	}
    
    private static void permutationsHelper(String input, String output)
    {
        if (input.length()==0)
            System.out.println(output);
        
        for (int i=0;i<input.length();i++)
            permutationsHelper(input.substring(0,i)+input.substring(i+1), output+input.charAt(i));
    }
	
    public static void printSubsets(int input[]) {
		// Write your code here
       printSubsetsHelper(input,0,new int[0]);
	}
    
    private static void printSubsetsHelper(int[] input, int startIndex, int[] output)
    {
        if (startIndex==input.length)
        {
            for (int i=0;i<output.length;i++)
            {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        
        int[] newOutput = new int[output.length+1];
        for (int i=0;i<output.length;i++)
        {
            newOutput[i]=output[i];
        }
        newOutput[output.length]=input[startIndex];
        printSubsetsHelper(input,startIndex+1,newOutput);
        
        printSubsetsHelper(input,startIndex+1,output);
    }


    

// public static void main(String[] args) {
//     Scanner s = new Scanner(System.in);
//     String input = s.nextLine();
//     permutations(input);
// }
	
	// public static void main(String[] args) {
	// 	int[] input = takeInput();
	// 	int k = s.nextInt();
	// 	printSubsetsSumTok(input, k);
	// }
    // public static void main(String[] args) {
	// 	Scanner s = new Scanner(System.in);
	// 	int input = s.nextInt();
	// 	String output[] = keypad(input);
	// 	for(int i = 0; i < output.length; i++) {
	// 		System.out.println(output[i]);
	// 	}
	// }
    }