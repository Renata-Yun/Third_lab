public class Essay
{
    public static int isSpace(String a, String b)
    {
        String withSpaces = a + " " + b;
        int count = 0;
        for (int i = 0; i < withSpaces.length(); i++)
        {
            char c = withSpaces.charAt(i);
            if (c == ' ')
            {
                count++;
            }
        }
        return withSpaces.length() - count;
    }
    public static void essay(int n, int k, String str)
    {
        String[] arrStr = str.split(" ");
        for (int i = 1; i < n; i++)
        {
            if (isSpace(arrStr[i-1], arrStr[i]) <= k)
            {
                arrStr[i] = arrStr[i-1] + " " + arrStr[i];
                arrStr[i-1] = "";
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (arrStr[i].length() > 0)
            {
                System.out.println(arrStr[i]);
            }
        }
    }
}
