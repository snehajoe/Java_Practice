package march23.decisionmaking;

public class CompareNumbers {
    public static void main(String[] args){
        int x= 25, y=20, z=26;

        if(x>y && x>z){
            System.out.println("X is greater than all");
        } else if(y>z){
            System.out.println("Y is greater than all");
        } else{
            System.out.println("Z is greater than all");
        }
    }
}
