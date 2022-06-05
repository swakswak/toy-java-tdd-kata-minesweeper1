package swak.swak.mineswepper;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class Cell {

    private final boolean bomb;

    private final Integer number;

    private boolean isCovered;

    private Cell(boolean bomb, Integer number) {
        this.bomb = bomb;
        this.number = number;
        this.isCovered = true;
    }

    public Cell(boolean bomb) {
        this(bomb, null);
    }

    public Cell() {
        this(false, 0);
    }

    public Cell(Integer number) {
        this(false, number);
    }

    @Override
    public String toString() {
        if (isCovered) {
            return ".";
        } else if (bomb) {
            return "*";
        } else {
            return String.valueOf(number);
        }
    }

    public boolean isCovered() {
        return isCovered;
    }

    public void click() {
        this.isCovered = false;
    }

    public boolean isBomb() {
        return bomb;
    }
}
