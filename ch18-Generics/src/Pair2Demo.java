public class Pair2Demo
{
    public static void main(String[] args)
    {
        String[] names = { "alphabet Soup", "Orange Coast College", "Zebra stripeS" };
        Pair2<String> result = mostCaps(names);
        System.out.println(result.getFirst());
        System.out.println("Expected: Orange Coast College");
        System.out.println(result.getSecond());
        System.out.println("Expected: OCC");
        Pair2<Integer> result2 = new Pair2<>(123, 456);
        result2.swap();
        System.out.println(result2.getFirst());
        System.out.println("Expected: 456");
        System.out.println(result2.getSecond());
        System.out.println("Expected: 123");
    }

    /**
      Gets the String containing the most capital letters 
      along with all its capital letters in order.
      @param strings an array of strings
      @return a pair (strings[i], caps(strings[i])) where
      strings[i] is the string containing the most capital
      letters and caps() is all the capital letters of that string.
      Returns the pair ("", "") if no strings with capitals letters.
     */
    public static Pair2<String> mostCaps(String[] strings)
    {
        int max = 0;
        String maxString = "";
        String maxCaps = "";
        for (int i = 0; i < strings.length; i++)
        {
            String caps = getCaps(strings[i]);
            if (caps.length() > max)
            {
                max = caps.length();
                maxString = strings[i];
                maxCaps = caps;
            }
        }
        return new Pair2<String>(maxString, maxCaps);
    }


    /**
     * Returns all the capital letters of a string in order
     * including duplicates.
     * @param str
     * @return all the capital letters of str
     */
    public static String getCaps(String str)
    {
        String ans = "";
        for (int i = 0; i < str.length(); ++i)
        {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
            {
                ans += c;
            }
        }
        return ans;
    }
}
