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

        // assert
        assertEquals("*", cell.toString());
    }

    @Test
    void should_Bomb_False() {
        // arrange
        Cell cell = new Cell();

        // act

        // asset
        assertEquals("0", cell.toString());
    }

    @Test
    void should_Near_Number_1() {
        // arrange
        Cell cell = new Cell(1);

        // act

        // asset
        assertEquals("1", cell.toString());
    }

    @Test
    void should_BeforeClick_Covered_True() {
        // arrance
        Cell cell = new Cell();

        // act

        // assert
        assertTrue(cell.isCovered());
    }
}
