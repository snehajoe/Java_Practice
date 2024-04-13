package april13;

public class ArrayDemo {
    public static void main(String[] args) {
        //syntax
        //type[] refName =  new type[size];
        //type[] refName = {e1, e2, e3, ...}

        String[] names = {"Vasu","Sonu", "Love", "Harpreet", "Shikha", "Ravneet", "Gairik"};
        int[] arr = {1, 2, 33, 56, 87};
        //index starts at 0, length=5, arr[4]= 87
        System.out.println(arr[0]);

        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        char[] array = {'p','r','a','g','r','a'};

        for (char c:array){
            System.out.print(c);
        }


    }

}
