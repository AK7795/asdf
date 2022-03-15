package com.ddjkj.ydh;

import java.util.Scanner;

    public class efsgnh {

        public int func(int x , int y){
            int z = x+y;
            return z;
        }

        public static void main(String[] args) {

            efsgnh obj = new efsgnh();
            int n1,n2;

            System.out.println("enter n1");
            Scanner num1 = new Scanner(System.in);
            int a = num1.nextInt();
            System.out.println("enter n2");
            Scanner num2 = new Scanner(System.in);
            int b = num2.nextInt();



            int c = obj.func(a,b);
            System.out.println("result is : " + c);
        }
    }

