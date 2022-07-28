import java.text.DecimalFormat;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.lang.Math;


public class Assigment1 {
    // public static double findGeometricSum(int k){
		// Write your code here
        // if(k == 0)
        // return  1.00 ;
        
        // double smallAns = findGeometricSum(k-1);
        // //int ans = ((1/2)^k) ; 
        // return  Math.pow(0.5,k) + smallAns ;
//	}

// static boolean isPalRec(String str,
// int s, int e)
// {
// if (s == e)
// return true;


// if ((str.charAt(s)) != (str.charAt(e)))
// return false;


// if (s < e + 1)
// return isPalRec(str, s + 1, e - 1);

// return true;
// }

         
// public static boolean isStringPalindrome(String input) {
    
//     int n = input.length();
 
//         if (n == 0)
//             return true;
 
//         return isPalRec(input, 0, n - 1);
    
// }



// public static int sumOfDigits(int input){
//     // Write your code here
//     if(input == 0)
//     return 0 ; 

//     int num = input%10 ;
//     int smallAns = sumOfDigits(input/10);

//     return smallAns + num  ;
// }


// public static int multiplyTwoIntegers(int m, int n){
//     // Write your code here
//     if(n==0)
//     return 0 ;
    
//     int smallAns = multiplyTwoIntegers(m, n-1) ; 
//     return m + smallAns ;
// }

// public static int countZerosRec(int input){
//     // Write your code here
//     if(input == 0)
//     return 0 ;
    
//     int count = 0;

//     if(count==0 && input==0)
//     count=1;
    
//     count = countZerosRec(input/10) ; 
//     int num = input%10 ;
    
//     if (num ==0 )
//     count++ ;
    
//     return count; 
// }

// public static int convertStringToInt(String input){
//     // Write your code here
//     if(input.isEmpty()==true)
//     return 0;
//     if(input.charAt(0)=='0')
//     convertStringToInt(input.substring(1));

//     int num = Integer.parseInt(input);
//     return num ; 


// }

public static String appendStar(String input){
    String output = '*'+input ; 
    return output ; 
}

// public static String output = new String() ; 
// public static int i = 0 ; 
// public static String addStars(String s) {

//     output = output + s.charAt(i);
 
//     if (i == s.length() - 1)
//         return "";
 
   
//     if (s.charAt(i) == s.charAt(i+1))
//         output = output + '*';    
 
//     addStars(s.substring(1));
//     return output ; 
   
// }

public static boolean check ; 
public static char ch;

// 
public static boolean checkAB(String input) {
    // Write your code here
    
    boolean b=true;
    if(input.charAt(0)!='a'){
        b=false;
    }else{
        b=check(input);
    }
    
    return b;

}

public static boolean check(String s){
    
    if(s.length()==0)
        return true;
    boolean b=false;
    if(s.charAt(0)=='a'){
        if(s.length()==1){
            return true;
        }else if(s.charAt(1)=='a'){
            b=check(s.substring(1));
        }else if(s.length()>=3 && s.substring(1, 3).equals("bb")){
            b=check(s.substring(2));
        }else{
            return false;
        }
    }else if(s.charAt(0)=='b'){
        if(s.length()==1){
            return true;
        }else if(s.charAt(1)=='a'){
            b=check(s.substring(1));
        }else{
            return false;
        }
    }
    
    return b;
}

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int k = s.nextInt();
        // double ans = findGeometricSum(k);
        // DecimalFormat dec = new DecimalFormat("#0.00000");
        // System.out.println(dec.format(ans));

        // Scanner s = new Scanner(System.in);
		// int n = s.nextInt();
		// System.out.println(sumOfDigits(n));

        // Scanner s = new Scanner(System.in);
		// int m = s.nextInt();
		// int n = s.nextInt();
		// System.out.println(multiplyTwoIntegers(m, n));

        // Scanner s = new Scanner(System.in);
		// int n = s.nextInt();
		// System.out.println(countZerosRec(n));
        
        // Scanner s = new Scanner(System.in);
		// String input = s.nextLine();
		// System.out.println(convertStringToInt(input));

            // Scanner s = new Scanner(System.in);
            // String input = s.nextLine();
            // System.out.println(addStars(input));
    
        Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
    }
}


