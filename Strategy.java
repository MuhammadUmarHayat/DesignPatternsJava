public interface SortStrategy {
    public void sort(int[] numbers);
}

public class BubbleSortStrategy implements SortStrategy {
    public void sort(int[] numbers) {
        // Bubble sort implementation
    }
}

public class QuickSortStrategy implements SortStrategy {
    public void sort(int[] numbers) {
        // Quick sort implementation
    }
}

public class MergeSortStrategy implements SortStrategy {
    public void sort(int[] numbers) {
        // Merge sort implementation
    }
}

public class SortContext {
    private SortStrategy strategy;
 
    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }
 
    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
 
    public void sort(int[] numbers) {
        strategy.sort(numbers);
    }
}
//main
int[] numbers = {5, 2, 4, 6, 1, 3};
SortContext context = new SortContext(new QuickSortStrategy());
context.sort(numbers);
