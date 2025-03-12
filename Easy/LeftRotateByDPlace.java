public class LeftRotateByDPlace {
	
	 public static void reverse(int arr[], int start, int end) {
        while (start < end) {  
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
	
   public static void LeftRotateByDPlaceA(int arr [] , int n , int d){
	   
	   reverse(arr, 0, d-1);
	   reverse(arr, d, n-1);
	   reverse(arr, 0, n-1);
   }
    
    public static void main(String args[]) {
        
       
        int arr[] = {1, 2, 3, 4, 5,6,7};
        int D = 2;  
		int n = arr.length;
		
        
      
       	System.out.print("before arr rotate by " +D + " palce : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " "); 
        }
        System.out.println();

 
        LeftRotateByDPlaceA(arr,n,D);

      
        System.out.print("after arr rotate by " +D + " palce : ");
		
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " "); 
        }
        System.out.println();
    }
}
