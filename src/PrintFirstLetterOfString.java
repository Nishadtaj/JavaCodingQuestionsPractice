public class PrintFirstLetterOfString
{
    public static void main (String[] args)
    {
        String str = "Hello I am Nishad";
        returnFirstAlphabet(str);
    }

    private static void returnFirstAlphabet(String string)
    {
        String word = "";
        String [] split = string.split(" ");

        for(int i=0; i<split.length; i++)
        {
            word = split[i];

            System.out.print(word.charAt(0));
        }
    }
}
