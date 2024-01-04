package Assignment1;

public class MissingConsecutiveNumber {

    // Function to return the missing element
    public static int missingNumber(int[] arr, int n ){
        int low=0, high=n-1;
        int mid;

        //BINARY SEARCH
        while (high>low) {
            mid = low+(high-low)/2;


            // Check if middle element is consistent
            if (arr[mid] - mid == arr[0]) {

                // No inconsistency till middle elements
                // When missing element is just after
                // the middle element
                if (arr[mid+1] - arr[mid] >1)
                    return arr[mid]+1;
                else{

                    // Move right
                    low=mid+1;
                }

            }
            else {

                // Inconsistency found
                // When missing element is just before
                // the middle element

                if (arr[mid] - arr[mid-1]>1)
                    return arr[mid]-1;
                else{

                    // Move left
                    high=mid-1;
                }
            }
        }

        // No missing element found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-3,-1,0,1,2,3,4,5,6,7,8,9,10};
        int n =arr.length;
        System.out.println(arr.length);
        System.out.println(missingNumber(arr,n));
    }
}
