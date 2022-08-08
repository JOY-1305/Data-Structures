import java.util.* ; 

public class Recusion {
    
    public static String[] printSubsequences( String str ){
      if(str.length() == 0 ){
        String[] output = new String[1] ; 
        output[0] = "" ; 
        return output ; 
      }
        
      String[] smallOutput = printSubsequences(str.substring(1)) ; 
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
       String [] output = printSubsequences(str) ; 
       for(String ouputString: output){
        System.out.println(ouputString);
       }
    }
}
