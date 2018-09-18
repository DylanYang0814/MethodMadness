package DYang;

public class DYangLib {
    public static void println(String str)
    {
        System.out.println(str);
    }

    public static boolean isPalindrome(String str){
        str.toLowerCase();
        int length = str.length();
        String reverse = "";

        while (length != 0){
            reverse = reverse + str.substring(length - 1, length);
            length--;
        }
        reverse.toLowerCase();

        System.out.println(str.equals(reverse));
        return str.equals(reverse);
    }
}
