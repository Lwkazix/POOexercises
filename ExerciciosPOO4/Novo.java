package ExerciciosPOO4;

public class Novo extends Imovel{
    public Novo(Double preco) {
        super(preco);
        this.preco = preco + 50.000;
        this.endereco = "QNM 32-CONJ A-CS 2";
    }

    public Novo(String endereco, Double preco) {
        super(preco);
    }

    @Override
    public String toString() {
        return "Novo{" +
                "endereco='" + endereco + '\'' +
                ", preco=" + preco +
                '}';
    }
}

