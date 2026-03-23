package basic;
import java.util.*;
public class maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers=");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a+" is maximum");
        }
        else if(b>a){
            System.out.println(b+" is maximum");
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
}
