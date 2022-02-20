package chapter8.gamelevel;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {   //advanced , super 둘다 들어올수 있으므로 상위클래스
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
