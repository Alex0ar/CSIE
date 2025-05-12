package acs.ase.ro.dpstructurale.flyweight;

public class CharacterPosition {
    private int linie;
    private int coloana;

    public CharacterPosition() {
    }

    public CharacterPosition(int linie, int coloana) {
        this.linie = linie;
        this.coloana = coloana;
    }

    public int getLinie() {
        return linie;
    }

    public void setLinie(int linie) {
        this.linie = linie;
    }

    public int getColoana() {
        return coloana;
    }

    public void setColoana(int coloana) {
        this.coloana = coloana;
    }
}
