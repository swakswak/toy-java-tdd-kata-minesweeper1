package swak.swak.mineswepper;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class Cell {

    private final boolean bomb;

    public Cell(boolean bomb) {
        this.bomb = bomb;
    }

    public boolean isBomb() {
        return bomb;
    }
}
