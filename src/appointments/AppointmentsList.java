package appointments;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import patients.Patient;

public class AppointmentsList implements KeyDynamicLists<Appointment, String>{
    private TreeSet<Appointment> appointments;
    public AppointmentsList(){
        this.appointments = new TreeSet();
    }

    @Override
    public Appointment get(String id) {
        try{
        return appointments.getFirst();
        }catch(NoSuchElementException e){
            return null;
        }
    }

    @Override
    public boolean remove(String id) {
        try{
        return appointments.remove(id);
        }catch(ClassCastException | NullPointerException e){
            return false;
        }
    }

    @Override
    public boolean add(Appointment item) {
        try{
        return appointments.add(item);
        }catch(ClassCastException | NullPointerException e){
            return false;
        }
    }

    @Override
    public Iterator getAll() {
        return appointments.iterator();
    }

    @Override
    public int size() {
        return appointments.size();
    }

    @Override
    public boolean isEmpty() {
        return appointments.isEmpty();
    }

    
}
