/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinic;

import WaitingRooms.waitingroomlist;
import appointments.AppointmentsList;
import java.time.LocalDate;
import java.time.LocalTime;
import patients.PacientsList;
import java.util.Iterator;
import patients.Patient;
import appointments.Appointment;

/**
 *
 * @author Yumor
 */
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
    }

    public Patient findPatient(String id) {
    }

    public boolean removePatient(String id) {
    }

    public Iterator<Patient> getPatients() {
    }

    public boolean scheduleAppointment(String code,  LocalDate newDate, LocalTime newTime) {
        if (appoinments.isEmpty()) return false; 
        Appointment appo = appoinments.get(code);
        if (appo==null) return false; 
        appo.reschedule(newDate, newTime);
        return true;
            
        
    }

    public Appointment findAppointment(String code) {
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime) {

    }

    public boolean cancelAppointment(String code) {

    }

    public Iterator<Appointment> getAppointments() {

    }

    public boolean checkInPatient(String patientId) {
        
    }

    public Patient getNextPatient() {

    }

    public Patient attendNextPatient() {

    }

    public int getWaitingPatientCount() {

    }

    public boolean isPatientWaiting(String patientId) {

    }
    
}
