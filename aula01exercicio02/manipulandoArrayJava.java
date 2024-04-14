import java.util.Arrays;

public class FileSystemPlayground {


    public static void main(String[] args) {

        int[] valoresNumericos = { 10,20,30,40,50 };
        String[] titulosMusicais = {"Smile - Kirk Franklin", 
        "Superstition - Stivie Wonder", "Hotel California"};
        
       System.out.println("Valores Numericos: " + Arrays.toString(valoresNumericos));
       System.out.println("Titulos de músicas:" + Arrays.toString(titulosMusicais));
       
       int somaValores = Arrays.stream(valoresNumericos).sum();
       System.out.println("Soma dos valores numéricos: " + somaValores);
       
       String[] musicasComSuperstition = Arrays.stream(titulosMusicais) 
                                        .filter(titulo -> titulo.contains("Superstition")
                                        || titulo.contains("California")) 
                                        .toArray(String[]::new);
      System.out.println("Musicas com a palavbra 'Superstition' e 'California' no titulo: " + Arrays.toString(musicasComSuperstition));
    }
  
}


