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

    @Test
    public void doesMergeSortWork() {
        Integer[] arr = {8, 3, 7, 4, 9, 2};
        Integer[] expected = {2, 3, 4, 7, 8, 9};

        sorter.mergeSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void doesQuickSortWork() {
        Integer[] arr = {15, 3, 2, 1, 9, 5};
        Integer[] expected = {1, 2, 3, 5, 9, 15};

        sorter.quickSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void doesRadixSortWork() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};

        sorter.radixSort(arr);

        assertArrayEquals(expected, arr);
    }
}