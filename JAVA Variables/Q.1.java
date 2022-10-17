//In a program input 3 number .A,Band C.You have to output the average of these 3 number.
import java.util.*;
public class Q.1 {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.Int();
        b=sc.Int();
        c=sc.Int();
        int sum=a+b+c;
        c=sum/3;
        System.out.print("sum"+c);

    }  
}

