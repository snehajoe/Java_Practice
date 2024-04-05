package march23.decisionmaking;

public class Test {
    public static void main(String[] args){
        int num= 2005;
        if(num>0){
            System.out.println("The number " + num+ " is positive");
        } else{
            System.out.println("The number " +num+ " is negative");
        }
        if(num%2 == 0){
            System.out.println("The number " + num+ " is even");
        } else{
            System.out.println("The number " + num+ " is odd");
        }
        if((num % 4 == 0) && (num %100 !=0) || (num%400 == 0)){
            System.out.println("The year " +num+" is a leap year");
        } else {
            System.out.println("The year " +num+" is not a leap year");
        }
    }
}
