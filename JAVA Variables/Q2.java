//In a program input the side a square. you have to output the area of the square 
import java.util.*;
public class Q2 {
    public static void main(String args[]){
        int side;
        System.out.print("Enter the side=");
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();
        int area=side*side;
        System.out.print("area of the square="+area);
    }
}
