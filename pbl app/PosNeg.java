import java.util.*;
public class PosNeg {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        System.out.println(a>=0?(a>0?"Positive":"Zero"):"Negative");
    }
}