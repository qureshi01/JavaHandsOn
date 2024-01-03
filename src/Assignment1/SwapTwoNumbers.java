package Assignment1;

import java.sql.SQLOutput;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        //USING THIRD VARIABLE
        int x=10;
        int y=20;
        System.out.println("Before Swapping:- ");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        int temp = x;
        x=y;
        y=temp;
        System.out.println("After Swapping:- ");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        System.out.println("--------------");
        //USING ONLY 2 VARIABLES

        int x1=5;
        int y1=10;

        System.out.println("Before Swapping:- ");
        System.out.println("x: "+x1);
        System.out.println("y: "+y1);

        x1=x1+y1; //x1 is now 15 (10+5=15)
        y1=x1-y1; //y1 is now 5 (15-10=5)
        x1=x1-y1; //x1 is now 10 (15-5=10)

        System.out.println("After Swapping:- ");
        System.out.println("x: "+x1);
        System.out.println("y: "+y1);

        System.out.println("----------------------");
        //USING XOR OPERATOR

        int x2=1;
        int y2=2;

        System.out.println("Before Swapping:- ");
        System.out.println("x: "+x2);
        System.out.println("y: "+y2);

        //Swap the numbers using bitwise XOR
        x2=x2^y2; //x2 is now 3 (011^010 = 011)
        y2=x2^y2; //y2 is now 1 (011^010=001)
        x2=x2^y2; //x2 is now 2 (011^001 = 010)

        System.out.println("After Swapping:- ");
        System.out.println("x: "+x2);
        System.out.println("y: "+y2);





    }
}
