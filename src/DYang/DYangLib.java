package DYang;
//Dylan(Chengjie) Yang 9/20/2018

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

    public static String dateStr(String str)
    {
        //Input: String in the format (“mm/dd/yyyy”)
        String month = str.substring(0, 2);
        String date = str.substring(3, 5);
        String year = str.substring(6, str.length());
        //Returns: String in the format (“dd – mm - yyyy”)

        System.out.println(date + " - " + month + " - " + year);
        return date + " - " + month + " - " + year;
    }

    public static int sumUpTo(int num)
    {
        int sum = 0;

        while (num != 0)
        {
            sum += num;
            num--;
        }
        System.out.println(sum);
        return sum;
    }

    public static void multiplicationTable(int base, int range)
    {
        int index = 0;
        int product = 0;
        while (index <= range)
        {
            product = base * index;
            index++;
            System.out.println(product);
        }
        return;
    }

    public static String cutOut(String mainStr, String subStr)
    {
        int first = mainStr.indexOf(subStr) + subStr.length();
        System.out.println(mainStr.substring(first, mainStr.length()));
        return mainStr.substring(first, mainStr.length());
    }
}
