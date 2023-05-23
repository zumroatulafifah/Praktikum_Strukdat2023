package Latihan2;

public class Minuman extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " diminum";
    }
}
