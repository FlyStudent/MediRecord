package patients;

import appointments.KeyDynamicLists;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author bryan
 */
public class PacientsList implements KeyDynamicLists<Patient, String> {

    private HashMap<String, Patient> patients;

    public PacientsList() {
        this.patients = new HashMap<>();
    }

    @Override
    public Patient get(String id) {
        try {
            return patients.get(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean remove(String id) {
        return this.patients.remove(id) != null;
    }

    @Override
    public boolean add(Patient item) {
        if (patients.containsKey(item.getId())) return false;
        return patients.put(item.getId(), item) == null;
    }

    @Override
    public Iterator<Patient> getAll() {
        return this.patients.values().iterator();
    }

    @Override
    public int size() {
        return this.patients.size();
    }

    @Override
    public boolean isEmpty() {
        return this.patients.isEmpty();
    }
}
