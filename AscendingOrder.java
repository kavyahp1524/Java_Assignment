package Arrays;

public class AscendingOrder {
    public static void main(String[]args){
        int[] arr= {130,20,50,40,60,90};
        int a = 0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }System.out.println(arr[i]);
        }
    }
}


