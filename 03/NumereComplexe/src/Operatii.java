public class Operatii {

    /**
     * Operatia de adunare a doua numere complexe
     */
    public static NumarComplex aduna(NumarComplex a, NumarComplex b) {
        NumarComplex rezultat = new NumarComplex();
        float re = a.getRe() + b.getRe();
        float im = a.getIm() + b.getIm();
        rezultat.setRe(re);
        rezultat.setIm(im);
        return rezultat;
    }

    /**
     * Operatia de inmultire a doua numere complexe
     */
    public static NumarComplex inmulteste(NumarComplex a, NumarComplex b) {
        NumarComplex rezultat = new NumarComplex();
        float re = a.getRe() * b.getRe() - a.getIm() * b.getIm();
        float im = a.getRe() * b.getIm() + a.getIm() * b.getRe() ;
        rezultat.setRe(re);
        rezultat.setIm(im);
        return rezultat;
    }
}
