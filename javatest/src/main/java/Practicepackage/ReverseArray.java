package Practicepackage;

import java.awt.*;

public class ReverseArray
{
    public static void test(String str)
    {
        String[] words = str.split(" ");
        String revStr = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String revWords = "";
            for (int j = word.length() - 1; j >= 0; j--)
            {
                revWords = revWords + word.charAt(j);

            }
            revStr = revStr + revWords + " ";
        }
        System.out.println(str);
        System.out.println(revStr);

    }
    public static void main (String args[])
    {
        test("I am Umesh");
        test("java");

    }
}
