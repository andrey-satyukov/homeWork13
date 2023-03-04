public class Hogwards {
    private int transgress; //трансгрессия
    private int witchcraft; //колдовство
    private String name;

    public Hogwards(String name, int transgress, int witchcraft) {
        this.name = name;
        this.transgress = transgress;
        this.witchcraft = witchcraft;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }
}
