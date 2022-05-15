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
        // arrange
        Cell cell = new Cell();

        // act

        // assert
        assertTrue(cell.isCovered());
    }

    @Test
    void should_BeforeClick_ToString_Dot() {
        // arrange
        Cell cell0 = new Cell();
        Cell cell1 = new Cell(1);

        //act

        // assert
        assertEquals(".", cell0.toString());
        assertEquals(".", cell1.toString());
    }

    @Test
    void should_AfterClick_Covered_False() {
        // arrange
        Cell cell = new Cell();

        // act
        cell.click();

        // assert
        assertFalse(cell.isCovered());
    }

    @Test
    void should_AfterClick_ToString_Number() {
        // arrange
        Cell cell0 = new Cell();
        Cell cell1 = new Cell(1);


        // act
        cell0.click();
        cell1.click();

        // assert
        assertEquals("0", cell0.toString());
        assertEquals("1", cell1.toString());
    }
}
