public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    public static String cutInHalf(String str){
        int len = str.length();
        int max = len/2;
        return str.substring(0, max);
    }
}