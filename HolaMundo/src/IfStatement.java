public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if (isBluetoothEnable){
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado.");
        } else {
            System.out.println("Por favor enciende tu bluetooht, para inciar la transferncia. ");
        }
    }
}
