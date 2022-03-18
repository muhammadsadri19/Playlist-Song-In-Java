package SampleDua_DlinkedList;

public class Lagu {
    private String namalagu;
    private String penyanyi;

    public Lagu(String lagu, String penyanyi) {
        this.namalagu = lagu;
        this.penyanyi = penyanyi;
    }


    public String getNamalagu() {
        return namalagu;
    }

    @Override
    public String toString() {
        return "\n Lagu = " + namalagu + "|| Penyanyi = " + penyanyi + "\n";
    }
}
