public class ForLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOffLight();

        for(int i= 0; i<=10; i++){
            printSOS();
        }

    }
    /**
     * Explicación: Es una función que simplemente imprime un mensaje
     * */
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    /**
     * Ecplicación: Es una función para delimitar el estado de la luz
     * @return isTurnOnLight: retorna el valor booleano
     */
    public static boolean turnOffLight(){
        isTurnOnLight = (isTurnOnLight)? true:false;
        return isTurnOnLight;
    }
}
