package swak.swak;

import org.junit.jupiter.api.Test;
import swak.swak.mineswepper.Cell;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class CellTest {
    @Test
    void should_BombIsTrue_InitializedInstance() {
        // arrange
        Cell cell = new Cell(true);

        // act
        boolean isBomb = cell.isBomb();

        //assert
        assertTrue(isBomb);
    }
}
