package april16;

public class SbDemo {
    public static void main(String[] args) {
        String s1 = "Pragra";
        System.out.println(s1);
        String s2 = s1.concat(" Class");
        System.out.println(s2);
        //System.out.println(s1.concat(" Class"));

        //mutable String
        StringBuffer sb= new StringBuffer("Sneha");
        sb.append(" Joe");
        System.out.println(sb);
        System.out.println(sb.reverse());

        StringBuilder sbr= new StringBuilder("Sneha");

    }
}
