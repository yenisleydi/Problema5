import java.util.Random;
import java.util.Scanner;

public class NumeroImpar {
    private int victoria=0;
    private int derrosta=0;
    public void impar(){
        Scanner scanner=new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(1000) + 1;
        if (numero % 2!=0){
            System.out.println("Ingresa un numero impar de 1 a 999");
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
    }

    public int getDerrosta() {
        return derrosta;
    }

    public int getVictoria() {
        return victoria;
    }
}
