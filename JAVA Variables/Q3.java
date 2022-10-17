/*Enter cost of 3 items from the user (using float data type) a pencil a pen 
 and an eraser you have to output the cost of the items to back to the user 
 as their bill*/
import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil,pen,eraser;
        System.out.print("Enter the cost of pencil=");
        pencil=sc.nextFloat();
        System.out.print("Enter the cost of pen=");
        pen=sc.nextFloat();
        System.out.print("Enter the cost of eraser=");
        eraser=sc.nextFloat();
        float totalCost=pencil+pen+eraser;
        System.out.print("\nTotal bill="+totalCost);
         
        float newbill= totalCost+(0.18f*totalCost);
        System.out.print("\nnew bill 18% GST="+newbill);
    }
    
}
