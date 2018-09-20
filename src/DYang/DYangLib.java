package DYang;
//Dylan(Chengjie) Yang 9/20/2018

public class DYangLib {
    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * Converts to lower case for equal comaparison
     * Declare an int with the length of the param
     * Declare empty string reverse which will be returned later
     * While the param not 0, take the last letter and add it to the reverse string
     * Repeat till length = 0 or all the letters have been modified
     * system prints boolean if param and the reverse of param is equal
     * returns ^
     * @param str
     * @return
     */
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

    /**
     * Declare new strings month, date year
     * Set them equal to the exact location contained in the param
     * system prints the newly ordered way of it.
     * @param str
     * @return
     */
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

    /**
     * Declare new empty int sum
     * Keeps adding the sum to the number and decreasing num by 1
     * till num is 0
     * returns and prints the sum
     * @param num
     * @return
     */
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

    /**
     * Declare empty ints index and product
     * while the index is less than param range,
     * take the param base and multiply it by index
     * increases index by 1 and prints the product
     * return void
     * @param base
     * @param range
     */
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

    /**
     * Finds the index of the param subStr in the mainStr
     * Since the index is the first letter, add the length to find the position of the last letter.
     * prints and returns the substring of the last letter of the substr till the length of the mainStr which is the end
     * @param mainStr
     * @param subStr
     * @return
     */
    public static String cutOut(String mainStr, String subStr)
    {
        int first = mainStr.indexOf(subStr) + subStr.length();
        System.out.println(mainStr.substring(first, mainStr.length()));
        return mainStr.substring(first, mainStr.length());
    }
}
