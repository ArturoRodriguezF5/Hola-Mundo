public class Funtions {
    public static void main(String[] args) {
        //double y = 3;

        //Area de un circulo
        //PI * r2
        //System.out.println(Math.PI * Math.pow(y,2));
        double aC = areaCirculo(3);
        System.out.println(aC);

        //Area de una esfera
        // 4 * PI * r2
        //System.out.println(4 * Math.PI * Math.pow(y,2));
        System.out.println(areaEsfera(3));

        //Volumen de una esfera
        //V = 4/3 Pi * r3
        //System.out.println((Math.PI * Math.pow(y,3)/(4/3)));
        System.out.println(volumenEsfera(3));

        //Convertir pesos a dolares
        System.out.println("Dolares: "+convertToDolar(1000, "COP"));
        System.out.println("Dolares: "+convertToDolar(200, "MXN"));
        System.out.println("Dolares: "+convertToDolar(50, "ARS"));

    }

    //Funcion para el area de un circulo
    /**
     * Descripción: Función que realiza la operación de obetner area de un circulo
     * @param y Radio
     * @return Devuelve el resultado del area
     * */
    public static double areaCirculo(double y){
        return Math.PI * Math.pow(y,2);
    }
    //Funcion para area de una esfera
    /**
     * Descripción: Función que realiza la operación de obetner area de una esfera
     * @param y Radio
     * @return Devuelve el resultado del area
     * */
    public static double areaEsfera(double y){
        return 4 * Math.PI * Math.pow(y,2);
    }
    //Volumen de una esfera
    /**
     * Descripción: Función que realiza la operación de obetner volumen de una esfera
     * @param y Radio
     * @return Devuelve el resultado del volumen
     * */
    public static double volumenEsfera(double y){
        return Math.PI * Math.pow(y,3)/(4/3);
    }
    //Funcion para convertir pesos mexicanos y colombianos a dolares
    /**
     *Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     **/
    public static double convertToDolar(double quantity , String currency){
        double USD;
        switch (currency){
            case "MXN":
                quantity = quantity * 0.050;
            break;
            case "COP":
                quantity = quantity * 0.00023;
            break;
            case "ARS":
                quantity= quantity * 0.0070;
                break;
            default:
                System.out.println("Por favor revisa las opciones");
        }


        return quantity;
    }
}

