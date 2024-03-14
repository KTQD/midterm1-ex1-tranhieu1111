public class MP3 extends Item {
    private int duration;

    public MP3(String name, String ID, float price, int duration) {
        super(name, ID, price);
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Duration: " + duration + " seconds");
    }

    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3 Player", "MP123", 50.0f, 180);
        mp3.showInfo();
}
