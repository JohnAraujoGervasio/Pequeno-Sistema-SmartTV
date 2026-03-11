public class Usuario {
    public static void main(String[] args) {

        //Criamos uma TV

        SmartTV minhaTv = new SmartTV();

        //Criamos o Controle e conectamos à nossa TV

        ControleRemoto controle = new ControleRemoto(minhaTv);

        //O usuário interage apenas com o controle

        controle.operar();
    }
}