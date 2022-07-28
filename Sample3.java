import java.util.Scanner;
public class Sample3 {
    public static void merge(int [] temp1,int [] temp2,int [] d ) 
	{
		

		int si1 = 0;
		int si2 = 0;
		int k = 0 ; 
		while(si1 < temp1.length && si2 < temp2.length){
			if(temp1[si1] <= temp2[si2]){
				d[k] = temp1[si1]; 
				si1++ ;
				k++ ; 
			}

            else if (temp1[si1] >= temp2[si2]){

            d[k] = temp2[si2]; 
				si2++ ;
				k++ ; 
			}
		
		} 

		
		if(si1 < temp1.length){
			while(si1 < temp1.length){
				d[k] = temp1[si1];
				si1++;
				k++;
			}
		}
		if(si2 < temp2.length){
			while(si2 < temp1.length){
				d[k] = temp2[si2];
				si2++;
				k++;
				
			}
		}

		// for(int i = 0  ; i < k ; i ++ ){
		// 	System.out.print(d[i] + " ");
		// }
		// System.out.println();

		
	}
	public static void mergeSort(int[] input){
		
		if(input.length <= 1 ){
		return ;
		}

		int [] temp1 = new int [(input.length)/2];
		int [] temp2 = new int [input.length- temp1.length];

		for(int i = 0 ; i < input.length/2 ; i++ ){
			temp1[i] = input[i];
		}
		for(int i = input.length/2 ; i < input.length ; i++ ){
			temp2[i - input.length/2] = input[ i];
		}
		
		// for(int i = 0 ; i < input.length/2 ; i++ ){
		// 	System.out.print(temp1[i] + " ");
		// }
		// System.out.println();

		// for(int i = input.length/2 ; i < input.length ; i++ ){
		// 	System.out.print(temp2[i - input.length/2] + " ");
		// }
        // System.out.println();
		 mergeSort(temp1);
		 mergeSort(temp2); 
		 merge(temp1, temp2, input);

	}
	
	

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String args[]){
        int[] input = takeInput();
		mergeSort(input);
		printArray(input);

    }
    
}
