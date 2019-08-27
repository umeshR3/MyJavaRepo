public class DuplicateLetterAndCount {
    public static void main(String argu[]) {

        String str = "w3schoolso";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    cnt++;

                    System.out.println(inp[j]+" "+ cnt);
                   // System.out.println(cnt);
                    break;
                }
            }
        }
    }
}
