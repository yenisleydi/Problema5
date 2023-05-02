import java.util.Random;
import java.util.Scanner;

public class Caracteres {
    private int victorias=0;
    private int derrotas=0;
    public void caracteres(){
        Random rand = new Random();
        Scanner scanner=new Scanner(System.in);

        String[] listaDeLetras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z",
                                    "A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String letraAleatoria = listaDeLetras[rand.nextInt(listaDeLetras.length)];

        System.out.println("Ingrese la letra que esta pensando");
        String letra=scanner.next();

        if (letra == letraAleatoria){
            System.out.println(letraAleatoria);
            System.out.println("------------------------------------------");
            System.out.println("|              G A N A S T E!!!          |");
            System.out.println("------------------------------------------");
            victorias++;
        }
        else {
            System.out.println(letraAleatoria);
            System.out.println("------------------------------------------");
            System.out.println("|            P E R D  I S T E!!!          |");
            System.out.println("------------------------------------------");
            derrotas++;
        }
    }
    public int getVictorias(){
        return victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
}
