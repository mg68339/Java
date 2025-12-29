public class Sorting {
    public static void printArray(int [] arr) {

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    public static void main(String[] args) {
        int arr[]={7,8,1,3,2};

        //Bubble Sort
        // for(int i=0;i<arr.length-i;i++){
        //     for(int j=0;j<arr.length-i-1;j++){

        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }


        // // selection sort
        // for(int i=0;i<arr.length-1;i++){
        //     int min=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j] < arr[min]) {
        //             min = j;   
        //         }
        //        }
        //         int temp = arr[min];
        //         arr[min] = arr[i];
        //         arr[i] = temp;
        // }

        //insertion sort
        for(int  i=1;i<arr.length;i++){
            int current = i;
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        printArray(arr);

        


    }
    
}
