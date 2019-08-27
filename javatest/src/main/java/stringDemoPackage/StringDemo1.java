package stringDemoPackage;

public class StringDemo1 {


    public static void main(String[] args) {
        String str1="Hello";
        String str2=new String("Hello");
        String str3=new String("Hello");
        String str4="Hello";
        System.out.println(str2==str3);
        System.out.println(str1==str4);
        int len=str1.length();
        char[] ch=new char[len];

        for (int i=0;i<ch.length;i++){
            System.out.println(ch);

        }
/*char[] ch=str1.toCharArray();
        for (char a:ch) {
            System.out.println(a);*/

        }


    }

