package ExerciciosPOO3;

public class Ingresso {
    public Double valor;
    public String data;
    public String local;

    public Ingresso(Double valor,String data, String local) {
        this.valor = valor;
        this.data = data;
        this.local = local;
    }

    public Ingresso() {
    }

    public void imprimiValor(){
        System.out.println("Valor: "+ 15.75);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + valor +
                ", data=" + data +
                ", local='" + local + '\'' +
                '}';
    }
}
