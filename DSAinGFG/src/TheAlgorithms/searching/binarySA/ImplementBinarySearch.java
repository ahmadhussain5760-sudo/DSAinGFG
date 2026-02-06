package TheAlgorithms.searching.binarySA;

public class ImplementBinarySearch {
    static int iterativeSearchAlgorithm(int arr[],int num){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==num){
                return mid;
            } else if (arr[mid]<num) {
                low=mid+1;
            } else if (arr[mid]>num) {
                high=mid-1;
            }
        }
        return -1;
    }


    static int recursiveSearchAlgorithm(int arr[],int low,int high,int num){
        if (low<=high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == num)
                return mid;
            else if (arr[mid] < num)
                return recursiveSearchAlgorithm(arr, mid + 1, high, num);
            else if (arr[mid] > num)
                return recursiveSearchAlgorithm(arr, low, mid - 1, num);
        }
        return -1;

    }








    public static void main(String[] args) {

    }
}
