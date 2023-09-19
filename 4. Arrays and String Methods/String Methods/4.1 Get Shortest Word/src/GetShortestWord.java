public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String str1, String str2){
        int len1;
        len1 = str1.length();
        int len2 = str2.length();
        if (len1>len2){
            return str2;
        }
        else{
            return str1;
        }
    }
}