package Iterator;

/*
 * @author Shyam Makwana
 */

public class NameRepository implements Container {

    public String names[] = {"Shyam", "Parth", "Hemal", "Charvi"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
