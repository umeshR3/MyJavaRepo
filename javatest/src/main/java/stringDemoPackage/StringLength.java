package stringDemoPackage;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println("String length "+str.length());


    }
}
