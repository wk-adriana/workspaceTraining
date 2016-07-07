import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Carte carte = new Carte();

        // Citire atribute carte de la tastatura
        Scanner s = new Scanner(System.in);
        System.out.println("Titlu: ");
        String titlu = s.nextLine();
        System.out.println("Autor: ");
        String autor = s.nextLine();
        System.out.println("Editura: ");
        String editura = s.nextLine();
        System.out.println("Nr. pagini: ");
        int nrPagini = Integer.parseInt(s.nextLine());

        carte.setTitlu(titlu);
        carte.setAutor(autor);
        carte.setEditura(editura);
        carte.setNumarPagini(nrPagini);

        Carte carteaB = new Carte();
        carteaB.setTitlu("1948");
        carteaB.setAutor("George Orwell");
        carteaB.setEditura("Polirom");
        carteaB.setNumarPagini(348);

        // Test metoda care verifica dacă o carte este în dublu exemplar
        System.out.println("verificareDubluExemplar: " + Verificari.verificareDubluExemplar(carte, carteaB));

        // Test metoda care verifica care carte este mai groasă decât altă
        System.out.println("verificareGrosimeCarte: " + Verificari.verificareGrosimeCarte(carte, carteaB));

        System.out.println(carte);
    }
}
