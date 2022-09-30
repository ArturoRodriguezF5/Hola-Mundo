public class arraysJava {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String [] [] cities = new String[4][2];

        int [] [] [] numbers = new int[2][2][2];
        int [] [] [] [] numbers4 = new int[1][2][3][4];

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        /*for (int i = 0; i < 4; i++) {
            System.out.println("Versiones de Android: " + androidVersions[i]);
        }*/
        //For each recorre cada localidad del arreglo y se la asigna a la variable
        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }
        cities [0] [0] = "Colombia";
        cities [0] [1] = "Medellín";
        cities [1] [0] = "Colombia";
        cities [1] [1] = "Bogotá";
        cities [2] [0] = "México";
        cities [2] [1] = "Guadalajara";
        cities [3] [0] = "México";
        cities [3] [1] = "CDMX";
        for (String[] citiesI: cities) {
            for (String name:citiesI) {
                System.out.println(name);
            }
        }
        /*for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }*/

        String[] [] [] [] animals = new String[2][3][2][2];
        animals[1] [0] [0] [1] = "Monkey";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 1; k++) {
                    for (int l = 0; l < 2; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }

                }

            }
        }
    }
}
