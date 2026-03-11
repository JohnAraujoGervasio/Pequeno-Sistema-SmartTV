public class Usuario {
    public static void main(String[] args) throws Exception {

        /** Criando um objeto da classe SmartTV */

        SmartTV smartTV = new SmartTV();
    
            System.out.println("A TV está ligada? " + smartTV.ligada);
            System.out.println("Canal atual: " + smartTV.canal);
            System.out.println("Volume atual: " + smartTV.volume);
    
            smartTV.ligada = true;
            System.out.println("A TV está ligada? " + smartTV.ligada);
    
            smartTV.canal = 10;
            System.out.println("Canal atual: " + smartTV.canal);
    
            smartTV.volume = 35;
            System.out.println("Volume atual: " + smartTV.volume);
    }
}
