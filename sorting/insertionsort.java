package sorting;

public class insertionsort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,2,1};
        //time complexity = 

        //insertion sort
      for(int i=1;i<arr.length; i++){
        int current =arr[i];
        int j=i-1;
        while(j>=0 && current <arr[j]){
            arr[j+1]= arr[j];
            j--;
        }
        //placemnt
        arr[j+1] = current;
      }
        
        printArray(arr);
    }
}
