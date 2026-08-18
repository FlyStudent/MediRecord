package Clinic;
import WaitingRooms.waitingroomlist;
import appointments.AppointmentsList;
import java.time.LocalDate;
import java.time.LocalTime;
import patients.PacientsList;
import java.util.Iterator;
import patients.Patient;
import appointments.Appointment;


public class Clinica {
    private PacientsList patients; 
    private AppointmentsList appoinments;
    private waitingroomlist waitingRoom;

    public Clinica() {
        this.patients = new PacientsList();
        this.appoinments = new  AppointmentsList();
        this.waitingRoom = new waitingroomlist();
    }
    
    public boolean addPatient(Patient patient) {
        patients.add(patient);
        return true;
    }

    public Patient findPatient(String id) {
    Iterator<Patient> it = patients.getAll();

    while (it.hasNext()) {
        Patient patient = it.next();

        if (patient.getId().equals(id)) {
            return patient;
        }
    }

    return null;
}

    public boolean removePatient(String id) {
        patients.remove(id);
        return true; 
    }

    public Iterator<Patient> getPatients() {
        return patients.getAll();
    }

    public boolean scheduleAppointment(String code,  LocalDate newDate, LocalTime newTime) {
        if (appoinments.isEmpty()) return false; 
        Appointment appo = appoinments.get(code);
        if (appo==null) return false; 
        appo.reschedule(newDate, newTime);
        return true;
            
        
    }

    public Appointment findAppointment(String code) {
        Iterator<Appointment> it = appoinments.getAll();

        while (it.hasNext()) {
        Appointment appo = it.next();

        if (appo.getCode().equals(code)) {
            return appo;
        }
    }

    return null;
}
    

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime) {
    }
    public boolean cancelAppointment(String code) {
    Iterator<Appointment> iterator = appoinments.getAll();

    while (iterator.hasNext()) {
        Appointment appointment = iterator.next();

        if (appointment.getCode().equals(code)) {
            iterator.remove();
            return true;
        }
    }

    return false;
}
    

    public Iterator<Appointment> getAppointments() {
        return appoinments.getAll();
    }

    public boolean checkInPatient(String patientId) {
        Iterator<Appointment> itAppo=appoinments.getAll();
        while(itAppo.hasNext()){
            Appointment appo = itAppo.next();
            if (appo.getPatient().getId().equals(patientId)&&appo.isToday()){
               waitingRoom.add(appo.getPatient());
               return true; 
            }
            
        }
        return false; 
    }

    public Patient getNextPatient() {
       
    }

    public Patient attendNextPatient() {
       
    }

    public int getWaitingPatientCount() {

    }

    public boolean isPatientWaiting(String patientId) {

    }
