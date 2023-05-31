package ExerciciosPOO2a;

public class Gato extends Animal{

        private String corPelo;
        private String raca;
        private String nome;

        public Gato(String corPelo, String raca, String nome, String nomeC) {
            super(nome, nomeC);
            this.corPelo = corPelo;
            this.raca = raca;
            this.nome = nome;
        }
        public Gato(boolean vivo,String nomeC,String especie,String sexo){
            super(nomeC, nomeC);
        }

        public Gato(String preto, String pintcher, Object o) {
            super();
        }


    public void enterrarOsso(){
            System.out.println("Esconder Osso");
        }
        public void brincar(){
            System.out.println("");
        }

        public String getCorPelo() {
            return corPelo;
        }

        public void setCorPelo(String corPelo) {
            this.corPelo = corPelo;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    public Gato() {
            corPelo = "Preto";
            raca = "Pedgrid";
            nome = "Storm";
            vivo = true;
            nomeCientifico = "petrupilos";
            especie = "descohecida";
            sexo = "Masculino";

    }
        @Override
        public String toString() {
            return "Gato{" +
                    "cor Pelo= '" + corPelo + '\'' +
                    ", raca= '" + raca + '\'' +
                    ", nome= '" + nome + '\'' +
                    ", vivo=" + vivo +
                    ", nome Cientifico='" + nomeCientifico + '\'' +
                    ", especie= '" + especie + '\'' +
                    ", sexo= '" + sexo + '\'' +
                    '}';
        }
}

