package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory implements Container{
    //you can decide to use other data structures
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        String lastUrl = urls.get(urls.size()-1);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public Iterator createIterator(){
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator{

        private BrowseHistory history;
        int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.getUrls().size());
        }

        @Override
        public Object current() {
            return history.getUrls().get(index);
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Object rewind() {
            index--;
            return history.getUrls().get(index);
        }

        @Override
        public int key() {
            return index;
        }
    }
}
