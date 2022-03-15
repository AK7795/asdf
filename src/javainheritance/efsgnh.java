package javainheritance;

import java.util.Scanner;

public class efsgnh {


        public static void main(String[] args) {

            add i = new add();
            sub j = new sub();
            mul k = new mul();
            division l = new division();

            efsgnh obj = new efsgnh();
            int n1,n2;
            System.out.println("enter n1");
            Scanner num1 = new Scanner(System.in);
            int a = num1.nextInt();
            System.out.println("enter n2");
            Scanner num2 = new Scanner(System.in);
            int b = num2.nextInt();



            int res1 = i.adder(a,b);
            int res2 = j.subtract(a,b);
            int res3 = k.multi(a,b);
            float res4 = l.div(a,b);

            System.out.println(res1);
            System.out.println(res2);
            System.out.println(res3);
            System.out.println(res4);
        }
    }

