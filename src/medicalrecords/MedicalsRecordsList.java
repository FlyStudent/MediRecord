package medicalrecords;

import WaitingRooms.SequentialDynamicsList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;


public class MedicalsRecordsList implements SequentialDynamicsList<MedicalRecord>{
private Stack<MedicalRecord> medicalHistory;

    public MedicalsRecordsList() {
        this.medicalHistory = new Stack();
    }

    @Override
    public MedicalRecord get() {
       try{
           return medicalHistory.peek();
       }catch(EmptyStackException e){
          return null;
       }
    }

    @Override
    public boolean remove() {
        try{
           medicalHistory.pop();
       }catch(EmptyStackException e){
          return false;
       }
        return true;
    }

    @Override
    public boolean add(MedicalRecord item) {
        return medicalHistory.push(item)!=null;
    }

    @Override
    public Iterator getAll() {
        if (medicalHistory.empty()) return null;
           return medicalHistory.iterator();
        
    }

    @Override
    public int size() {
        return medicalHistory.size();
    }

    @Override
    public boolean isEmpty() {
        return medicalHistory.isEmpty();
    }

}
