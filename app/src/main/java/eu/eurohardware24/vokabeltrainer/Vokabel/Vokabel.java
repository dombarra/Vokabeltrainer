package eu.eurohardware24.vokabeltrainer.Vokabel;

/**
 * Created by DominicNB on 19.06.2016.
 */
public class Vokabel {

    String vokabel, bedeutung;
    int index;

    public Vokabel(int index, String vokabel, String bedeutung) {
        this.index = index;
        this.vokabel = vokabel;
        this.bedeutung = bedeutung;
    }

    public Vokabel (int index){
        this.index = index;
    }

    public void indexplus (){
        index++;
    }
    public String getVokabel() {
        return vokabel;
    }

    public void setVokabel(String vokabel) {
        this.vokabel = vokabel;
    }

    public String getBedeutung() {
        return bedeutung;
    }

    public void setBedeutung(String bedeutung) {
        this.bedeutung = bedeutung;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
