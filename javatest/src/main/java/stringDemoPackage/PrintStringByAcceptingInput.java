package stringDemoPackage;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class PrintStringByAcceptingInput {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        if(scan.nextLine().equals(str))
        {
            System.out.println("I love candies");
        }


    }
}
