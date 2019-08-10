package javaLoo;

import java.util.Scanner;

public class AvgOfNumberUsingfForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the count");
            sum=sum+scan.nextInt();
        }
        System.out.println("Sum of Number "+sum);

    }

}
