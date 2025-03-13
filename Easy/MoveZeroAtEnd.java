public class MoveZeroAtEnd {
	
	public static void swap( int arr [], int j , int i){
	int temp = arr[i];
	arr[i]   = arr[j];
	arr[j]   = temp;
	
	}
	public static int [] ShiftZeroAtEnd(int arr [] ) {
	
	int i = 0; 
	for (int j = 0 ; j < arr.length ; j++ ){
		if (arr[j] != 0 ) {
			swap (arr,j,i );
			i++;
			}
	
		}
		return arr;
	}
	
    
    public static void main(String args[]) {
        
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
		
		System.out.println("before :");
		for (int i =0; i<arr.length; i++){
		System.out.print( arr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("after :");
		int arr1 [] = ShiftZeroAtEnd(arr);
		for (int i =0; i<arr1.length; i++){
		System.out.print( arr[i]+ " ");
		}
		System.out.println();
		
        
}
}
