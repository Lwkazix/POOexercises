package ExerciciosPOO3;

public class Cinema {
    public static void main(String[] args) {
        VIP vip = new VIP();
        Ingresso ing = new Ingresso();
        CamaroteInferior cf = new CamaroteInferior();
        CamaroteSuperior cs = new CamaroteSuperior(30.00,"21-02-2023","Shopping Higuatemi",15);

        System.out.println(vip.toString());
        System.out.println(ing.toString());
        System.out.println(cf.toString());
        System.out.println(cs.toString());



    }
}
