//put your name here
public class SmallestLargest{
    public static void main(String[] args){
        //init array
        int[] arr = new int[10];
        //fill array
        for(int i = 0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
        }
        //print using methods
        System.out.println("The smallest value for the array is: " +smallestValue(arr));
        System.out.println("The largest value for the array is: " +largestValue(arr));
    }


    public static int smallestValue(int[]arr){
        int smallest = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int largestValue(int[]arr){
        int largest = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}