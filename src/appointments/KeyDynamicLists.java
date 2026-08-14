package appointments;
import Clinic.DynamicLists;
public interface KeyDynamicLists<T,K> extends DynamicLists<T> {
    public T get(K id);
    public boolean remove(K id);
}
