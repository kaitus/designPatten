package patterns.TemplateMethodDesignPattern.TemplateMethod;

abstract class Game {

    public Game(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public void run() {
        start();
        while (!haveWinner())
            takeTurn();
        System.out.println("Player " + getWinningPlayer() + " wins");
    }

    protected abstract int getWinningPlayer();
    protected abstract boolean haveWinner();
    protected abstract void takeTurn();
    protected abstract void start();

    protected int currentPayer;
    protected final int numberOfPlayer;

}
