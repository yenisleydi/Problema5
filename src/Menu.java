import java.util.Scanner;

public class Menu {
    public void menu(){
        Caracteres caracteres=new Caracteres();
        Numeros numeros=new Numeros();
        NumerosPares numerosPares=new NumerosPares();
        NumeroImpar numeroImpar=new NumeroImpar();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------  M E N Ú --------");
            System.out.println("1. Caracteres");
            System.out.println("2. Numeros de 1-1000");
            System.out.println("3. Numeros pares");
            System.out.println("4. Numeros impares");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    caracteres.caracteres();
                    break;
                case 2:
                    numeros.numeros();
                    break;
                case 3:
                    numerosPares.par();
                    break;
                case 4:
                    numeroImpar.impar();
                    break;
                case 5:
                    System.out.println("Contador de victorias y derrotas:");
                    System.out.println("Caracteres - Victorias: " + caracteres.getVictorias() + ", Derrotas: " + caracteres.getDerrotas());
                    System.out.println("Numeros - Victorias: " + numeros.getVictoria() + ", Derrotas: " + numeros.getDerrosta());
                    System.out.println("Numero Par - Victorias: " + numerosPares.getVictoria() + ", Derrotas: " + numerosPares.getDerrosta());
                    System.out.println("Numero Impar - Victorias: " + numeroImpar.getVictoria()+ ", Derrotas: " + numeroImpar.getDerrosta());
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 5);

    }
}
