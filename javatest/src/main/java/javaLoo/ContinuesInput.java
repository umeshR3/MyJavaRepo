package javaLoo;

import java.util.Scanner;

public class ContinuesInput {
    public static void main(String[] args) {
        String q;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        for(int i=n;i=='q';i++)
        {
            System.out.println(i);
        }
    }
}
