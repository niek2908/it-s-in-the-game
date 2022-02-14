package Main;

public class player {
    private int burnout;
    private int level;
    private int difficulty;


    public int getDifficulty() {
        return difficulty;
    }
    public  player(int difficulty){

    }
    public int getBurnout() {
        return burnout;
    }

    public int getLevel() {
        return level;
    }

    public void increaseBurnout(int amount) {
        burnout = this.burnout + amount*difficulty;
    }
    public void lowerBurnout(int amount) {
        burnout = this.burnout - amount*difficulty;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
