/**
 * Stikalo34.java
 *
 * Opis:
 * Osnovni razred Stikalo34, ki predstavlja osnovno funkcionalnost stikala.
 *
 * Avtor: Gašper Zdešar
 * Naloga 35
 */
public class Stikalo34 {
    private String lokacija;
    private boolean vklopljeno;
    private int intenzivnost;

    public Stikalo34(String lokacija) {
        this.lokacija = lokacija;
        this.vklopljeno = false;
        this.intenzivnost = 0;
    }

    public void vklopi() {
        this.vklopljeno = true;
    }

    public void izklopi() {
        this.vklopljeno = false;
        this.intenzivnost = 0;
    }

    public boolean jeVklopljeno() {
        return this.vklopljeno;
    }

    public void spremeniIntenzivnost(int intenzivnost) {
        if (vklopljeno && intenzivnost >= 0 && intenzivnost <= 100) {
            this.intenzivnost = intenzivnost;
        }
    }

    public int getIntenzivnost() {
        return this.intenzivnost;
    }

    public String getLokacija() {
        return this.lokacija;
    }
}