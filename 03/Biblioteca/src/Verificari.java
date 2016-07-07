public class Verificari {

    public static boolean verificareDubluExemplar(Carte carteaA, Carte carteaB) {
        return  carteaA.equals(carteaB);
    }

    public static Carte verificareGrosimeCarte(Carte carteaA, Carte carteaB) {
        if (carteaA.getNumarPagini() >= carteaB.getNumarPagini()) {
            return carteaA;
        } else {
            return carteaB;
        }
    }
}
