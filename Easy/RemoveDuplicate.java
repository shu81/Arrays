public class RemoveDuplicate {
	
	public static int RemoveDuplicateElement(int arr [] ){
		
		int i =0;
		for (int j=1; j<arr.length; j++ ){
			
			if(arr[j] != arr[i] ) {
				arr[i+1] = arr[j];
				i++;
				}
			}
	
		return i++;
	}
	
	
	
	public static void main (String args []){
		
		int arr [] = {1,1,1,2,2,3,3,4,10};
		
		int m = arr.length;
		
		System.out.println(" size of arrya before remove Duplicate element  :" + m);
		
		int n = RemoveDuplicateElement(arr);
		
		System.out.println(" size of arrya after  remove Duplicate element  :" + n);
		
	}
	
	
	
}