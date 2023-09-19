public class HundredthPrime
{
   public static void main(String[] args)
   {
      int current = 1;
      int maxnumber = 100;
      int contador = 0;
      while (contador < maxnumber){
         current++;
         for (int divisor = 2; divisor <= current; divisor++){
            if (current == divisor){
               contador++;
               break;
            }
            else{
               if (current % divisor == 0){
                  break;
               }
            }
         }
      }
      System.out.println(current);
   }
}