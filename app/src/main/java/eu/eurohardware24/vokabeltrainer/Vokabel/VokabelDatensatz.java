package eu.eurohardware24.vokabeltrainer.Vokabel;

/**
 * Created by DominicNB on 19.06.2016.
 */
public class VokabelDatensatz extends Vokabel {
    String[] vokabelArray, bedeutungArray, indexArray;

    public VokabelDatensatz(int index, String vokabel, String bedeutung) {
        super(index, vokabel, bedeutung);
        vokabelArray[index] = vokabel;
        bedeutungArray[index] = bedeutung;
    }

public VokabelDatensatz (String[] vokabelArray, String[] bedeutungArray, int index){
    super(index);
    this.vokabelArray = vokabelArray;
    this.bedeutungArray = bedeutungArray;
}


}




