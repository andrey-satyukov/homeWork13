public class Kogtervan extends Hogwards{
    private int mind;//ум
    private int wisdom;//мудрость
    private int wit;//остроумие
    private int creative;//творчество

    public Kogtervan(String name, int transgress, int witchcraft, int mind, int wisdom, int wit, int creative) {
        super(name, transgress, witchcraft);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
