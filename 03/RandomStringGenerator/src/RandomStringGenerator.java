import java.util.Random;

public class RandomStringGenerator {

    private int lungime;

    private String alfabet;

    public RandomStringGenerator(int lungime, String alfabet) {
        this.lungime = lungime;
        this.alfabet = alfabet;
    }

    public String next() {
        char[] aAlfabet = alfabet.toCharArray();
        Random generator = new Random();
        String rezultat = "";
        int contor = 0;
        while (contor < lungime) {
            int pozitie = generator.nextInt(aAlfabet.length);
            rezultat += aAlfabet[pozitie];
            contor++;
        }
        return rezultat;
    }
}
