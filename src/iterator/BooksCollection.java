package iterator;

public class BooksCollection implements Collection {

    private String[] titles = {"Design", "Patterns", "Data", "Structures", "Algorithms"};

    @Override
    public Iterator iterator() {
        return new BooksIterator();
    }

    private class BooksIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < titles.length)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return titles[index++];
            else
                return null;
        }
    }

}
