package stringDemoPackage;

public class checkLetterisPresnet {
    public static void main(String[] args) {
        String str="Umbrella";
        boolean per=false;
        for(int i=0;i<=str.length();i++)
        {
            if(str.charAt(i)=='e')
            {
                per=true;
                break;
            }
        }
        System.out.println(per);
    }
}
