package ExerciciosPOO4;

public class Imovel {
    public String endereco;
    public Double preco;

    public Imovel(Double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
