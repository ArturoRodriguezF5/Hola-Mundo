import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
    printSOS();
    }

    public static void printSOS(){

        boolean on = false;

        System.out.println("Deseas pedir ayuda? y/n");
        Scanner in = new Scanner(System.in);
        String pA = in.nextLine();
        on = (pA.equals("y"))? true:false;
        System.out.println(on);

        boolean ayudaRecibida = false;

        if (on == true){

            while(ayudaRecibida != true){
                System.out.println(". . . _ _ _ . . .");
                System.out.println("Recibio ayuda? y/n");
                String rA = in.nextLine();
                ayudaRecibida = (rA.equals("y")? true:false);
            }
        }
        else{
            System.out.println("Nos alegra que estes bien.");
        }
    }
}
