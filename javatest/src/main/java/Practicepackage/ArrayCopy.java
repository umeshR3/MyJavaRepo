package Practicepackage;

public class ArrayCopy {
    public static void main(String args[])
    {
        char chr[]={'a','b','y'};
        System.out.println(chr);
        String chstr= String.copyValueOf(chr);
        String chstr1=String.copyValueOf(chr,0,2);
        System.out.println(chstr);
        System.out.println(chstr1);

    }
}
