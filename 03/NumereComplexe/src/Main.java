public class Main {

    public static void main(String[] args) {
        NumarComplex primulNumar = new NumarComplex();
        NumarComplex alDoileaNumar = new NumarComplex();

        primulNumar.setRe(2);
        primulNumar.setIm(4);

        alDoileaNumar.setRe(3);
        alDoileaNumar.setIm(5);

        NumarComplex rezultatAdunare = Operatii.aduna(primulNumar, alDoileaNumar);
        NumarComplex rezultatInmultire = Operatii.inmulteste(primulNumar, alDoileaNumar);

        System.out.println("Adunare: " + rezultatAdunare);
        System.out.println("Inmultire: " + rezultatInmultire);

    }
}
