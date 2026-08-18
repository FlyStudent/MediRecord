/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinic;

import appointments.Appointment;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import patients.Patient;

/**
 *
 * @author bryan
 */
public class ClinicController {
    
    private Clinica clinic;
    private iView view;

    public void setView(iView view) {
        this.view = view;
    }

    private  ClinicController(iView view) {
        this.clinic = new Clinica();
        this.view = view;
    }
    
    private static ClinicController controller;
    
    public static ClinicController getInstance(iView view){
        if(controller==null)
            controller = new ClinicController(view);
        return controller;
    }
            
    //singletone 
    public void addPatient(Patient patient){

    }

    public Patient findPatient(String id){
        
    }

    public void removePatient(String id){
        
    }

    public Iterator<Patient> getPatients(){
        
    }

    public boolean scheduleAppointment(Appointment appointment){
        return false;
    }

    public Appointment findAppointment(String code){
        return null;
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        return false;
    }

    public boolean cancelAppointment(String code){
        return false;
    }

    public Iterator<Appointment> getAppointments(){
        return null;
    }

    public boolean checkInPatient(String patientId){
        boolean status = clinic.checkInPatient(patientId);
        if(status){
            view.showMessage("Registro se completo el checkIn");
        }else{
            view.showError("No se completo el checkIn, el paciente no tiene cita registrada");
        }
        return status;
    }
    
    public Patient getNextPatient(){
        return null;
    }

    public Patient attendNextPatient(){
        Patient pat =clinic.getNextPatient();
        if(pat==null){
            view.showError("Ya no existen pacientes en la lista de espera");
        }else {
            clinic.attendNextPatient();
        }
        return pat;
    }

    public int getWaitingPatientCount(){
        return 0;
    }

    public boolean isPatientWaiting(String patientId){
        return false;
    }
}
