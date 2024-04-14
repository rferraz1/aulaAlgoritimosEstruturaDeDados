import java.util.Arrays;

public class FileSystemPlayground {


    public static void main(String[] args) {

      int[][] myteste = {
        {145,455,223},
        {15,60,56},
        {33,44,58},
        {01,02,03}
      };
      int elemento = myteste[1][2];
      System.out.println("O elemento é: " + elemento);
      int maxLoop = myteste.length;
      for (int i = 0; i < maxLoop ; i++)
      {
         System.out.println("linha: " + i);
         System.out.println("O elemento no loop, na coluna 1 é: " + myteste[i][0]);
         System.out.println("O elemento no loop, na coluna 2 é: " + myteste[i][1]);
         System.out.println("O elemento no loop, na coluna 3 é: " + myteste[i][2]);
       } 
    }
}
