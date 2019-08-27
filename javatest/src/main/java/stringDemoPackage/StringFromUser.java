package stringDemoPackage;

import java.util.Scanner;

public class StringFromUser {
    public static void main(String[] args) {
        System.out.println("Enter the String");

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        System.out.println(str);
    }
}
