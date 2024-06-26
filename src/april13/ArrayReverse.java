package april13;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        arrayReverse(arr);
        arrayMax(arr);
        arrayMin(arr);

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ " ");
        }
    }

    public static void arrayReverse(int[] arr){
        for (int i=0,j=arr.length-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


            /*int[] reversedArr = new int[arr.length];
            int j = 0;

            for (int i = arr.length-1; i > 0; i--){
                reversedArr[j] = arr[i];
                System.out.println(reversedArr[j]);
            }*/

            /*int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }*/
    }

    public static void arrayMax(int[] arr){
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        System.out.println("Maximum element in the array: "+ max);
    }

    public static void arrayMin(int[] arr){
        int min = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]< min){
                min= arr[i];
            }
        }
        System.out.println("Minimum element in the array: "+ min);
    }
}
