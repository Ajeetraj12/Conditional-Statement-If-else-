import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number is ");
         int a = sc.nextInt();
        System.out.print("Enter 2nd Number is ");
         int b = sc.nextInt();
        System.out.println("Choose case 1(+),2(-),3(*),4(/),5(%)");
         int operator = sc.nextInt();

        /**
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */



        switch (operator) {
             case 1:
                 System.out.println("Final result is"+" "+a+"+"+b+" = "+(a+b));
                 break;
             case 2 :
                 System.out.println("Final result is"+" "+a+"-"+b+" = "+(a-b));
                 break;
             case 3 :
                 System.out.println("Final result is"+" "+a+"*"+b+" = "+(a*b));
                 break;
             case 4 : if(b==0) {
                 System.out.println("Invalid Devision");
             } else {
                 System.out.println("Final result is"+" "+a+"/"+b+" = "+(a/b));
             }
             break;
             case 5 : if(b==0) {
                 System.out.println("Invalid Devision");
             } else {
                 System.out.println("Final result is"+" "+a+" % "+b+" = "+(a%b));
             }
             break;
             default:
                 System.out.println("Invalid Operator");
         }
         }
    }
