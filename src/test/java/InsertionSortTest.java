import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;


class InsertionSortTest {

    @Test
    public void shouldReturnSortedArray(){
        List<Integer> numbers = new ArrayList<>(List.of(1,5,3,6,123,676,234,13 ));
        List<Integer> expected = new ArrayList<>(List.of(1,3,5,6,13,123,234,676));
        InsertionSort insertionSort = new InsertionSort(numbers);

        numbers = insertionSort.sort();

        Assertions.assertIterableEquals(expected , numbers);
    }

}