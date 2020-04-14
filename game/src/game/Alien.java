package game;

public class Alien extends Sprite {

    private final int INITIAL_X = 0;

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("src/enemy"
        		+ ".png");
        getImageDimensions();
    }

    public void move() {

        if (y > 1000) {
            y = INITIAL_X;
        }

        y += 1;
    }
}

