class StringRevers{
    public static void revereseByWord(String str)
    {
        String[] words=str.split(" ");
        String revString="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String revword=" ";
            for(int j=word.length()-1;j>=0;j--)
            {
                revword=revword+word.charAt(j);

            }
            revString=revString+revword+"";
        }
        System.out.println(str);
        System.out.println(revString);
    }
}

public class ReverseTheStringWordByWord {
    public static void main(String[] args) {
        StringRevers.revereseByWord("Umesh is good Boy");

    }

}
