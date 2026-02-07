import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SorterTest {

    private Sorter sorter;

    @Before
    public void setUp() {
        sorter = new Sorter();
    }

    @Test
    public void doesGnomeSortWork() {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        Integer[] expected = {1, 2, 5, 5, 6, 9};

        sorter.gnomeSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void doesInsertionSortWork() {
        Integer[] arr = {10, 2, 0, 30, 4};
        Integer[] expected = {0, 2, 4, 10, 30};

        sorter.insertionSort(arr);

        assertArrayEquals(expected, arr);
    }
}