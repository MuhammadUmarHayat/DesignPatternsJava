import java.util.*;

public class MyCollection implements Iterable<String> {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return items.get(index++);
            }
            throw new NoSuchElementException();
        }
    }
}
//main
MyCollection collection = new MyCollection();
collection.addItem("Item 1");
collection.addItem("Item 2");
collection.addItem("Item 3");

for (String item : collection) {
    System.out.println(item);
}
