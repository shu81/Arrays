public class LargestNumber {
	
	public static int largestNumber(int arr []){
		
		int largest = arr[0];
		
		for (int i=0; i<arr.length-1; i++){
			
			if(arr[i] > largest){
				
				largest = arr[i]; 
				
				}	
			
			
			}
			
			return largest;
	}	
	
	
	public static void main (String args []){
		
		
		
		int arr [] = { 2, 5, 7, 10, 1};
		
		int MaxNumber = largestNumber(arr);
		
		System.out.println("largest number is :" + MaxNumber);
		
	}
	
	
	
}