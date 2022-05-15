package swak.swak;

import org.junit.jupiter.api.Test;
import swak.swak.mineswepper.Cell;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class CellTest {
    @Test
    void should_Bomb_True() {
        // arrange
        Cell cell = new Cell(true);

        // act
        boolean isBomb = cell.isBomb();

        // assert
        assertTrue(isBomb);
    }

    @Test
    void should_Bomb_False() {
        // arrange
        Cell cell = new Cell();

        // act
        boolean isBomb = cell.isBomb();

        // asset
        assertFalse(isBomb);
    }

    @Test
    void should_Near_Number_1() {
        // arrange
        Cell cell = new Cell(1);

        // act
        Integer result = cell.getNumber();

        // asset
        assertEquals(1, result);
    }
}
