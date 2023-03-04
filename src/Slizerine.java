public class Slizerine extends Hogwards {
    private int trick;//хитрость
    private int determination;//решительность
    private int ambition;//амбициозность
    private int resourcefulness;//находчивость
    private int lustForPower;// жажада власти

    public Slizerine(String name, int transgress, int witchcraft, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, transgress, witchcraft);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
