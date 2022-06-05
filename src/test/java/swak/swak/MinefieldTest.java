package swak.swak;

import org.junit.jupiter.api.Test;
import swak.swak.mineswepper.Cell;
import swak.swak.mineswepper.Minefiled;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class MinefieldTest {
    @Test
    void should_ThrowsException_InvalidWidthOrInvalidHeight() {
        // arrange
        // act
        // assert
        assertThrows(IllegalArgumentException.class, () -> new Minefiled(1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> new Minefiled(1, 2, 1));
        assertThrows(IllegalArgumentException.class, () -> new Minefiled(2, 1, 1));
    }

    @Test
    void should_create() {
        // arrange
        Minefiled minefiled1 = new Minefiled(3, 3, 4);
        Minefiled minefiled2 = new Minefiled(4, 4, 8);

        // act

        //assert
        assertEquals(9, minefiled1.getCells().size());
        assertNotNull(minefiled2);
    }

    @Test
    void should_ThrowsException_NumberOfBombsExceeded() {
        // arrange
        // act
        // assert
        assertThrows(IllegalArgumentException.class, () -> new Minefiled(4, 4, 10));
        assertThrows(IllegalArgumentException.class, () -> new Minefiled(4, 4, 16));
    }

    @Test
    void should_exactNumberOfMine() {
        // arrange
        final int numberOfBombs = 8;
        Minefiled minefiled = new Minefiled(4, 4, numberOfBombs);

        // act
        long bombCount = minefiled.getCells()
                .stream()
                .filter(Cell::isBomb)
                .count();

        // assert
        assertEquals(numberOfBombs, bombCount);
    }
}
