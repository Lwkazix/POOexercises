package ExerciciosPOO2b;

public class Vida {
    public static void main(String[] args) {
        Rica rich = new Rica("Bill Gates",40,2000000);
        Pobre pr = new Pobre("Damião",42);
        Miseravel msrv = new Miseravel("João Batista",50);


        System.out.println(rich.toString());
        rich.fazCompras();
        System.out.println();
        System.out.println(pr.toString());
        pr.trabalhar();
        System.out.println();
        System.out.println(msrv.toString());
        msrv.mendigar();
        System.out.println();
    }
}
