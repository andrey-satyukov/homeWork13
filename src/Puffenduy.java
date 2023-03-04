public class Puffenduy extends Hogwards{
    private int hardworking; // трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Puffenduy(String name, int transgress, int witchcraft, int hardworking, int loyalty, int honesty) {
        super(name, transgress, witchcraft);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
