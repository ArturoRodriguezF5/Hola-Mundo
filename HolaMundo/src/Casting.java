public class Casting {
    public static void main(String[] args) {
        //En un año ubicar en hogares a 30 perritos
        //Cuantos perritos ubiqué al mes

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        //Casteo de la variable monthlyDogs

        int estimateMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimateMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a / b);
        double c = (double) a / b;
        System.out.println(c);

        char n = '1';
        int nI = (int) n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
