package swak.swak.mineswepper;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Minefiled {
    private final List<Cell> cells;
    private final int width;
    private final int height;

    private final int maximumNumberOfBombs;
    private final int numberOfBombs;

    public Minefiled(int width, int height, int numberOfBombs) {
        this.validateLength(width, height);
        this.maximumNumberOfBombs = (width - 1) * (height - 1);
        this.validateNumberOfBombs(numberOfBombs);

        this.width = width;
        this.height = height;
        this.numberOfBombs = numberOfBombs;

        this.cells = Stream.iterate(0, n -> n + 1)
                .limit((long) width * height)
                .map(element -> new Cell())
                .toList();

        ThreadLocalRandom.current()
                .ints(0, cells.size())
                .distinct()
                .limit(numberOfBombs)
                .forEach(randomIndex -> cells.get(randomIndex).setBomb());
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
