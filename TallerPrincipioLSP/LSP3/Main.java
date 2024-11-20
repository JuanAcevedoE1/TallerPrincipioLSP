package TallerPrincipioLSP.LSP3;

public class Main {
    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        bicicleta.mover();  
        coche.mover();      
    }
}
