package march23;

public class Assignment {
    public static void main(String[] args){
        System.out.println("Before swapping: ");
        int x= 10;
        int y= 20;
        System.out.println("Value of x: "+ x);
        System.out.println("Value of y: "+y);
        int z = x;
        x=y;
        y=z;
        System.out.println("After swapping:");
        System.out.println("Value of x: "+ x);
        System.out.println("Value of y: "+y);

        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println((x>=y));
        System.out.println(x<=y);
        System.out.println(x>y);
        System.out.println(x<y);
    }
}
