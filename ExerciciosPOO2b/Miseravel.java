package ExerciciosPOO2b;

public class Miseravel extends Pessoa{
    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendigar(){
        System.out.println("Voce é doido ou quer me da um real?");
    }

    @Override
    public String toString() {
        return "Miseravel{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
