package TheAlgorithms.searching.linearSA;

public class AnExample1 {
    static int linearSearch(int arr[],int num){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,4};int x=3;//output should be index:2

        if (linearSearch(arr1,x)==-1){
            System.out.println("i don't found the num.");
        }else
            System.out.println("index:"+linearSearch(arr1,x));
    }
}
