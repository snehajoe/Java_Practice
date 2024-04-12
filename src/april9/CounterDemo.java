package april9;

public class CounterDemo {

    //int count=0;      will print 1 3 times as the count variable is not updated
    static int count = 0;   //static will update the variable once its changed

    CounterDemo(){
        count++;
        System.out.println(count);

    }

    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();
    }
}
