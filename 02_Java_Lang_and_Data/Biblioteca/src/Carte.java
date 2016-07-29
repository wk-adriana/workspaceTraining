
public class Carte {
    private String titlu;

    private String autor;

    private String editura;

    private int numarPagini;

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getNumarPagini() {
        return numarPagini;
    }

    public void setNumarPagini(int numarPagini) {
        this.numarPagini = numarPagini;
    }

    @Override
    public String toString() {
        return getTitlu().toUpperCase() + ", " + getAutor() +
                ", " + getEditura().toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Carte carte = (Carte) o;
        return  (getAutor().toLowerCase().equals(carte.getAutor().toLowerCase()) &&
                getEditura().toLowerCase().equals(carte.getEditura().toLowerCase()) &&
                getTitlu().toLowerCase().equals(carte.getTitlu().toLowerCase()) &&
                getNumarPagini() == carte.getNumarPagini());
    }
}
