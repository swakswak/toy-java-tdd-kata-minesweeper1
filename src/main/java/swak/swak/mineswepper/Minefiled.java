package swak.swak.mineswepper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class Minefiled {
    private final List<Cell> cells;
    private final int width;
    private final int height;

    private final int maximumNumberOfBombs;

    public Minefiled(int width, int height, int numberOfBombs) {
        this.validateLength(width, height);
        this.maximumNumberOfBombs = (width - 1) * (height - 1);
        this.validateNumberOfBombs(numberOfBombs);

        this.width = width;
        this.height = height;
        this.cells = Stream.iterate(0, n -> n + 1)
                .limit((long) width * height)
                .map(element -> new Cell())
                .toList();
    }

    private void validateNumberOfBombs(int numberOfBombs) {
        if (numberOfBombs > maximumNumberOfBombs) {
            throw new IllegalArgumentException("The maximum number of bombs has been exceeded.");
        }
    }

    private void validateLength(int width, int height) {
        if (width < 3 || height < 3) {
            throw new IllegalArgumentException("'width' or 'height' must be greater than or equal to 3.");
        }
    }

    public List<Cell> getCells() {
        return cells;
    }
}
