package swak.swak.mineswepper;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class Cell {

    private final boolean bomb;

    private final Integer number;

    private Cell(boolean bomb, Integer number) {
        this.bomb = bomb;
        this.number = number;
    }

    public Cell(boolean bomb) {
        this(bomb, null);
    }

    public Cell() {
        this(false, null);
    }

    public Cell(Integer number) {
        this(false, number);
    }

    public boolean isBomb() {
        return bomb;
    }

    public Integer getNumber() {
        return number;
    }
}
