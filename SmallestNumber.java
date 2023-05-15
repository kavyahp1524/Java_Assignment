package Arrays;

public class SmallestNumber {
    public static void main(String[]args){
        int[] arr= {10,20,50,40,60,90};
        int a = 0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        System.out.println("The smallest number in an array is:\t"+arr[0]);
    }
}
