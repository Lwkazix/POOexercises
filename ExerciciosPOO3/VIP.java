package ExerciciosPOO3;

public class VIP extends Ingresso{
    public Double valorAdicional;
    public VIP(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public VIP(Double valor, String data, String local) {
        super(valor,data,local);
    }

    public Double getValorAdicional() {
        this.valorAdicional = valorAdicional + 9.00;
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public VIP(){
        valorAdicional = 9.00;
        valor = 24.75;
        data = "21-02-2023";
        local = "Shopping Higuatemi";
    }

    @Override
    public String toString() {
        return "VIP{" +
                "valorAdicional=" + valorAdicional +
                ", valor=" + valor +
                ", data=" + data +
                ", local='" + local + '\'' +
                '}';
    }
}
