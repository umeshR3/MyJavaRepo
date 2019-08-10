package Practicepackage;

public class Array2 {
    public static void main(String areg[])
    {
        char ch[]={'a','b','f','h'};
        System.out.println(ch);
        String chstr=String.copyValueOf(ch);
        System.out.println(chstr);

        String substr=String.copyValueOf(ch,2,3);
        System.out.println(substr);

    }
}
