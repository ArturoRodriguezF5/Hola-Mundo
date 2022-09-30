public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono por 200 pesos
        salary = salary + 200;
        System.out.println(salary);

        //Pension: 50 descuento
        salary = salary - 50;
        System.out.println("Salario sin pension: "+salary);

        //" horas extra $30 c/u
        //Comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Arturo Rodríguez";
        employeeName = employeeName + " Flores";
        System.out.println(employeeName);

        employeeName = "Arthy " + employeeName;
        System.out.println(employeeName);
    }
}
