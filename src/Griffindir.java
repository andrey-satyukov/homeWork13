public class Griffindir extends Hogwards{
    private int nobility; //благородство
    private int honor; //честь
    private int bravery; // храбрость

    public Griffindir(String name, int transgress, int witchcraft, int nobility, int honor, int bravery) {
        super(name, transgress, witchcraft);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
