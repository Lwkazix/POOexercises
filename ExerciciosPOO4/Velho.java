package ExerciciosPOO4;

public class Velho extends Imovel{
    public Velho(Double preco) {
        super(preco);
        this.preco = preco - 30.000;
        this.endereco = "QNM 32-CONJ H-CS 14";
    }

    public Velho(String endereco, Double preco) {
        super(preco);
        endereco = "QNM 32-CONJ H-CS 14";

    }

    @Override
    public String toString() {
        return "Velho{" +
                "endereco='" + endereco + '\'' +
                ", preco=" + preco +
                '}';
    }
}
