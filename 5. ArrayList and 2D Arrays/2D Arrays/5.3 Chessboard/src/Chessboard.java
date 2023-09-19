public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int num1 = 0; num1 < chessboard.length; num1++){
         for (int num2 = 0; num2 < chessboard[num1].length; num2 += 2){
            if (num1%2 == 0){
               System.out.print('\u25A1');
               System.out.print('\u25A0');
            } else if (num1%2 != 0) {
               System.out.print('\u25A0');
               System.out.print('\u25A1');
            }
         }
         System.out.println();
      }
   }
}