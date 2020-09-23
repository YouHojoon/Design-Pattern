public class CompareFileName implements Comparable{
    @Override
    public int compareTo(Object o1, Object o2) {
        return ((FileInfo) o1).getName().compareTo(((FileInfo)o2).getName());
    }
}
