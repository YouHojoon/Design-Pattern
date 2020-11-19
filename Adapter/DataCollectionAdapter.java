import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T>{

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public boolean put(T t) {
        return list.add(t);
    }

    @Override
    public T elemAt(int index) {
        return list.get(index);
    }

    @Override
    public int length() {
        return list.size();
    }

    @Override
    public Iterator createIterator() {
        return list.iterator();
    }
}
