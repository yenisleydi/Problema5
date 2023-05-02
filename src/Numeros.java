import java.util.Random;
import java.util.Scanner;

public class Numeros {
    private int victoria=0;
    private int derrosta=0;
    public void numeros(){
        Scanner scanner=new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(1000) + 1;
        System.out.println("Ingrese un numero de 1 a 1000");
        int num=scanner.nextInt();
        if (num==numero){
            System.out.println(numero);
            System.out.println("------------------------------------------");
            System.out.println("|              G A N A S T E!!!          |");
            System.out.println("------------------------------------------");
            victoria++;
        }
        else {
            System.out.println(numero);
            System.out.println("------------------------------------------");
            System.out.println("|            P E R D  I S T E!!!          |");
            System.out.println("------------------------------------------");
            derrosta++;
        }

    }

    public int getDerrosta() {
        return derrosta;
    }

    public int getVictoria() {
        return victoria;
    }
}
