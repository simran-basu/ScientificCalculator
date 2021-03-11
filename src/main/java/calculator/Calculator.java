package calculator;

import java.util.*;
import java.lang.Math;
public class Calculator {
    static int Factorial(int n)
    {
        if (n<=2)
            return n;
        else
            return n*Factorial(n-1);
    }
    public static void main(String args[])
    {
        int c,n,p;
        char choice='y';
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            System.out.println("Enter a choice from before: ");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function.");
            System.out.println("3. Natural logarithm.");
            System.out.println("4. Power function.");
            c = sc.nextInt();
            switch (c)
            {
                case 1: System.out.println(Math.sqrt(n));
                    break;
                case 2: System.out.println(Factorial(n));
                    break;
                case 3: System.out.println(Math.log(n));
                    break;
                case 4: System.out.println("Enter the power: ");
                    p=sc.nextInt();
                    System.out.println(Math.pow(n,p));
                    break;
                default: System.out.println("Wrong option!");
            }
            System.out.println("Do you want to continue: ");
            choice=sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');
    }
}