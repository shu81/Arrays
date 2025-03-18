public class FindSingleNumber {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 6, 7, 4}; 
        int result = findSingleNumber(arr);
        System.out.println("The number that appears once is: " + result);
    }

    public static int findSingleNumber(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];  
            int count = 0; 

           
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++; 
                }
            }

           
            if (count == 1) {
                return num; 
            }
        }

        return -1;
    }
}
