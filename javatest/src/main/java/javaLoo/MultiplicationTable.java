package javaLoo;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int N=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+" *25 "+i+" = "+(N*i));
        }
    }
}
