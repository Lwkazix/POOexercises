package ExerciciosPOO4;

public class Vender {
    public static void main(String[] args) {
        Imovel im = new Imovel(120.000);
        Novo nv = new Novo(170.000);
        Velho vl = new Velho(90.000);

        System.out.println(im.toString());
        System.out.println(nv.toString());
        System.out.println(vl.toString());
    }
}
