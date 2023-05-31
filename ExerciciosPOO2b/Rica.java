package ExerciciosPOO2b;

public class Rica extends Pessoa{
    private double dinheiro;


    public void fazCompras(){
        this.dinheiro = dinheiro;
        System.out.println(" Go to the Mall");
    }
    public Rica(String nome, int idade,double dinheiro) {
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Rica{" +
                "dinheiro=" + dinheiro +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
