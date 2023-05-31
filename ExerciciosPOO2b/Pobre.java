package ExerciciosPOO2b;

public class Pobre extends Pessoa{
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalhar(){
        System.out.println("Acordar as 7:00 escutar Merda do Chefe");
    }

    @Override
    public String toString() {
        return "Pobre{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
