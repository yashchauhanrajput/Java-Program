//In a program input 3 number .A,Band C.You have to output the average of these 3 number.
import java.util.*;
public class Q1 {
    public static void main(String args[]){
        int a,b,c;
        System.out.print("Enter three number=");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int sum=a+b+c;
        c=sum/3;
        System.out.print("Average="+c);

    }  
}
