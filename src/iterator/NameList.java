package iterator;

/**
 * Created by Pawel_D on 2017-07-01.
 */
public class NameList implements HasIterator {

    private String[] names;

    public NameList(String... names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }

    @Override
    public NameListIterator createIterator() {
        return new DefaultNameListItarator();
    }

    private class DefaultNameListItarator implements NameListIterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[currentIndex];
            } else {
                return null;
            }
        }
    }
}
