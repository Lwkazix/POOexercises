package ExerciciosPOO3;

public class CamaroteInferior extends VIP{
    public CamaroteInferior(Double valor, String data, String local) {
        super(valor,data,local);
    }
    public CamaroteInferior(Double valorAdicional) {
        super(valorAdicional);
    }

    public CamaroteInferior() {
        valorAdicional = 12.00;
        valor = 27.75;
        data = "Shopping Higuatemi";
    }


    @Override
    public String toString() {
        return "CamaroteInferior{" +
                "valorAdicional=" + valorAdicional +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
    //    public CamaroteInferior(Double valorAdicional) {
//        super(valorAdicional);
//
//    }
}
