public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Night";

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("Seleccionaste el modo Light");
                break;
            case "Night":
                System.out.println("Seleccionaste el modo Night");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste el modo Blue Dark");
                break;
            case "Dark":
                System.out.println("Seleciconaste el modo Dark");
                break;
                default:
                    System.out.println("Selecciona una opción");
        }
    }
}