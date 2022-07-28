import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
import org.w3c.dom.html.HTMLElement;

import java.lang.*;
import java.util.Arrays;

public class test {
//     public static void intersection(int[] arr1, int[] arr2) {
// 	    //Your code goes here
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         int i = arr1.length - 1 ; 
//         int j = arr2.length - 1 ; 

//         int x = java.lang.Math.min(i,j);
        
//        // System.out.println(i + " " + j);
//     for(int k = 0 ; k<= i ; k++){
//         for(int l = 0  ; l<= j ; l++){
//             if(arr1[l]==arr2[k]){
//                 System.out.print(arr2[k] + " ");
//             }
//         }

//     }
// }

// public static int leftSum(int[] arr, int index ){

//     if(index == 0)
//     return 0 ; 
//     int sum =0 ;
//     for(int i = 0  ; i < index ; i++){
//         sum = sum + arr[i];
//     }
//     return sum ; 


// }

// public static int rightSum(int[] arr, int index ){
    
    
//     int sum =0 ;
//     for(int i = index+1  ; i < arr.length ; i++){
//         sum = sum + arr[i];
//     }
//     return sum ; 

// }

// public static int incIndex(int index){
//     return index++ ; 
// }
// public static int arrayEquilibriumIndex(int[] arr){  
//     //Your code goes here
//     int index = 0  ; 
//     int sumLeft    ;  
//     int sumRight   ;
//     int diff = -1  ; 
//     //int equIndex = arr[index] ; 
//     for(int j= 0 ; j < arr.length ; j++){
//      sumLeft  = leftSum(arr, index) ;  
//      sumRight = rightSum(arr, index) ; 
     

//     // System.out.println("the left sum is " + sumLeft);
//     //System.out.println("the right sum is " + sumRight);
//      diff = sumRight - sumLeft ;
//     if(diff ==0){
//     break ;
//     }
//     index+=1 ;
//     }
// //System.out.println(diff);
    
// if(diff != 0 )
//     return -1 ; 
//     return index ; 

// }
//public static int findUnique(int[] arr) {
    //Your code goes here
  //  int n = arr.length; 
    // int num = 0;
    // Arrays.sort(arr);
    // int j = 0 ; 
    // for(int i = 0; i < arr.length ; i++){
    //     System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // for(int i = 1 ; i < arr.length ; i++){
    //     if(arr[j] != arr[i] && arr[i] != arr[j+1]){
    //         num = arr[j];
    //         System.out.println(num); 
    //     }
    //     j++ ; 
    // }

    

    
    // for(int i =1 ; i < arr.length ; i++ )
    // {
    //     System.out.println(arr[j] + " " + arr[i]);
         
    //     if(arr[j]!=arr[i]){
    //         if(arr[i] != arr[j+2])
    //     {   
    //         num = arr[j];  
    //         break ; 
    //     }
    //     }
    //     j=j+1 ;
       
    // }
    // return num ; 
//}

public static int  binSearch(int [] arr , int num){
    int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            if (arr[m] == num)
                return m;
 
            if (arr[m] < num)
                l = m + 1;
 
            else
                r = m - 1 ;
        }
        
        
    return -1 ;

}

public static int smallArr(int [] arr , int si , int diff){
    int check ; 
    
    int count = 0 ;
   int [] small = new int [arr.length -1 ] ;
    for(int i = 0 ,  k = si ; i < small.length ; i++){
        small[i]  = arr[k] ; 
        k++ ; 
    }
    printArray(small);
    for(int i = 0 ; i < small.length ; i++){
    check = binSearch(small, diff) ; 
    if(check != -1 ){
        //System.out.println(j + " " + check) ;
        
      count+=1 ;   
      
    }
}
    return count ; 
}
public static int pairSum(int[] arr, int num) {
   // Your code goes here
    Arrays.sort(arr);
    int check = 0 ; 
    int count = 0 ; 
    int diff = 0  ;
    
    int [] temp1 = new int[ arr.length - 1] ;
    
    for(int  i  = 0 ; i < temp1.length ; i++ ){
        temp1[i] = arr[i];
    }
    for(int i = 0 ; i < arr.length ; i++)  {
        diff = num - arr[i] ;
        int temp = count ;  
        count = smallArr(arr, i+1, diff);
        //System.out.println(count);
        count  = temp + count ; 
        // printArray(arr1);
        // check = binSearch(arr1, diff) ; 
        //if(check != -1 ){
            //System.out.println(j + " " + check) ;
            
          //count+=1 ;   
          
        //}

    
    }
    

    return count ; 

     
 }

// public static int tripletSum(int[] arr, int num) {
//     //Your code goes here
//     Arrays.sort(arr);

//     int l,r ;
//     int arr_size = arr.length ; 
//     int count = 0 ;
//     for (int i = 0; i < arr_size - 2; i++) {
 
        
//         l = i + 1; 
//         r = arr_size - 1; 
//         while (l < r) {
//             if (arr[i] + arr[l] + arr[r] == num) {
//                 count ++ ;
//             }
//             else if (arr[i] + arr[l] + arr[r] < num)
//                 l++;

//             else 
//                 r--;
//         }
//     }
//     return count ;
// }


// public static void rotate(int[] arr, int d) {
//     //Your code goes here
//     if(arr.length == 0){
//         return ;
//     }
//     int i = 0  ;
//     int [] temp = new int[d] ; 
//     for(i = 0 ; i < temp.length ; i++){
//         temp[i] = arr[i] ; 
//     }

    

//     for(int j = 0 ; j < arr.length && i < arr.length; j++){

//         arr[j] = arr[i] ;
//         i++;
//     }

//     int k = 0 ;   
//     for(int j = i-d   ; j < arr.length ; j++ ){
//         arr[j] = temp[k] ; 
//         k++ ; 
//     }

   // printArray(arr);
//}



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
        //int t = Integer.parseInt(br.readLine().trim());

        // while(t > 0) {
        //     int[] arr1 = takeInput();
        //     int[] arr2 = takeInput();
        //     intersection(arr1, arr2);
        //     System.out.println();

        //     t -= 1;
        // }
    //     int t = Integer.parseInt(br.readLine().trim());

    //     while(t > 0) {

    //         int[] arr = takeInput();
    //         System.out.println(arrayEquilibriumIndex(arr));

    //         t -= 1;
    //     }
    // }

    // int t = Integer.parseInt(br.readLine().trim());

    // while(t > 0) {

    //     int[] arr = takeInput();
    //     System.out.println(findUnique(arr));

    //     t -= 1;
    // }

    int t = Integer.parseInt(br.readLine().trim());

    while(t > 0) {

        int[] arr = takeInput();
        int num = Integer.parseInt(br.readLine().trim());
        System.out.println(pairSum(arr, num));

        t -= 1;
    }
    // int t = Integer.parseInt(br.readLine().trim());

    // while(t > 0) {

    //     int[] input = takeInput();
    //     int d = Integer.parseInt(br.readLine().trim());
    //     rotate(input, d);
    //     printArray(input);

    //     t -= 1;

//}

    
}
}
