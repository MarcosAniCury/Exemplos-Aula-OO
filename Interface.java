public class Interface {
    public static void main(String args[]) {
        Player player = new Player(100, 100);

        player.die();
        player.setLife(0);
    }
}

interface IStatus {
    boolean die();
    boolean revive();
    int getLife();
    void setLife(int life);
    int getMana();
    void setMana(int mana);
}

class Player implements IStatus{
    private int life;
    private int mana;

    public Player(int life, int mana) {
        this.life = life;
        this.mana = mana;
    }

    @Override
    public int getLife() {
        return life;
    }
    @Override
    public void setLife(int life) {
        this.life = life;
        die();
    }
    @Override
    public int getMana() {
        return mana;
    }
    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }
    @Override
    public boolean revive() {
        if (life > 0) {
            System.out.println("Está vivo");
            return true;
        } else {
            System.out.println("Reviveu com 1 de vida");
            setLife(1);
            return false;
        }
    }
    public boolean die() {
        if (life > 0) {
            System.out.println("Está vivo");
            return false;
        } else {
            System.out.println("Está morto");
            return true;
        }
    }
    @Override
    public String toString() {
        return "player{" +
                "life=" + life +
                ", mana=" + mana +
                '}';
    }
}
