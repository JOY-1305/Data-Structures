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

    // public static void main(String[] args) {
	// 	Scanner s = new Scanner(System.in);
	// 	int input = s.nextInt();
	// 	String output[] = keypad(input);
	// 	for(int i = 0; i < output.length; i++) {
	// 		System.out.println(output[i]);
	// 	}
	// }
}
