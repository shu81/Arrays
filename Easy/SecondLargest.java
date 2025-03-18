public class SecondLargest {
	
	public static int secondLargestNumber(int arr []){
		
		int largest = arr[0];
		int scondlargest = Integer.MIN_VALUE;
		
		
		
		for (int i=1; i<arr.length; i++){
			
			if(arr[i] > largest ){
				
				 scondlargest = largest;
				 largest = arr[i];
				 
					}
					else if (arr[i] < largest  &&  arr[i] > scondlargest){
					scondlargest = arr [i];
					}
			
		}
	
		return scondlargest ;
	}	
	
	
	public static void main (String args []){
		
		
		
		int arr [] = { 2, 5, 7, 10, 1};
		
		int MaxNumber = secondLargestNumber(arr);
		
		System.out.println(" second largest number is :" + MaxNumber);
		
	}
	
	
	
}