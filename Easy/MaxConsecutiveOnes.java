public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1}; 
        
        int result = findMaxConsecutiveOnes(arr);
        
        System.out.println("Maximum consecutive 1's: " + result);
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;  
        int currentCount = 0;  

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++; 
                maxCount = Math.max(maxCount, currentCount);  
            } else {
                currentCount = 0;  
            }
        }

        return maxCount;
    }
}
