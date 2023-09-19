public class LettersList
{
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    public static String[] getLettersList(String str){
        String[] lista = new String[str.length()];
        for (int count = 0;count < str.length();count++){
            lista[count] = str.substring(count, count+1);
        }
        return lista;
    }
}