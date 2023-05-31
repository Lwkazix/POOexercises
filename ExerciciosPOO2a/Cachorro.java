package ExerciciosPOO2a;

public class Cachorro extends Animal{

        private String corPelo;
        private String raca;
        private String nome;
        private String nomeC;

        public Cachorro(String corPelo, String raca, String nome, String nomeC) {
            super(nome,nomeC);
            this.corPelo = corPelo;
            this.raca = raca;
            this.nome = nome;
        }
        public Cachorro(boolean vivo,String nomeC,String especie,String sexo){
            super(nomeC, nomeC);
        }

        public Cachorro(String preto, String pintcher, Object o) {
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

        public Cachorro() {
            corPelo = "Branco";
            raca = "BullDog";
            nome = "Shifu";
            vivo = true;
            nomeCientifico = "Smuliatupctos";
            especie = "Desconhecida";
            sexo = "Masculino";

        }
        @Override
        public String toString() {
            return "Cachorro{" +
                    "corPelo='" + corPelo + '\'' +
                    ", raca='" + raca + '\'' +
                    ", nome='" + nome + '\'' +
                    ", vivo=" + vivo +
                    ", nomeCientifico='" + nomeCientifico + '\'' +
                    ", especie='" + especie + '\'' +
                    ", sexo='" + sexo + '\'' +
                    '}';
        }
}

