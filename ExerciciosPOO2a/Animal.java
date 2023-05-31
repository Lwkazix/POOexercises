package ExerciciosPOO2a;

public class Animal {
    protected boolean vivo;
    protected String nomeCientifico;
    protected String especie;
    protected String sexo;

    public Animal(String nomeC, String c) {
    }

    public Animal() {
    }

    public void alimentar(){
        System.out.println("Comendo Ração");
    }
    public void reproduzir(){
        System.out.println("Se reproduzindo >>>> (¬‿¬)(☞ﾟヮﾟ)☞");
    }
    public void emitirSom(){

    }
    public boolean isVivo(){
        return false;
    }
}
