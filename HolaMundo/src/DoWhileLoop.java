import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el numero de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir" + "\n");

            Scanner in = new Scanner(System.in);
            response = Integer.valueOf(in.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    System.out.println("Movies: ");
                    break;
                case 2:
                    System.out.println("Series: ");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while(response !=0 );
    }
}
