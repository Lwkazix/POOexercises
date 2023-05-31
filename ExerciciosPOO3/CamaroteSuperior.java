package ExerciciosPOO3;

public class CamaroteSuperior extends VIP{
    public Integer valorcama;

    public Integer getValorcama() {
        this.valorAdicional = valorAdicional + 10;
        return valorcama;
    }

    public void setValorcama(Integer valorcama) {
        this.valorcama = valorcama;
    }

    public CamaroteSuperior(Double valorAdicional, Integer valorcama) {
        super(valorAdicional);
        this.valorcama = valorcama;
    }

    public CamaroteSuperior(Double valor, String data, String local, Integer valorcama) {
        super(valor, data, local);
        this.valorcama = valorcama;
    }

    public CamaroteSuperior(Integer valorcama) {
        this.valorcama = valorcama;
    }

    public CamaroteSuperior(Double valor, String data, String local) {
        super(valor,data,local);
    }

    public CamaroteSuperior(Double valorAdicional) {
        super(valorAdicional);
    }

    @Override
    public String toString() {
        return "CamaroteSuperior{" +
                "valorAdicional=" + valorAdicional +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}

