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

    private ClinicController(iView view) {
        this.clinic = new Clinica();
        this.view = view;
    }

    private static ClinicController controller;

    public static ClinicController getInstance(iView view) {
        if (controller == null)
            controller = new ClinicController(view);
        return controller;
    }

    // singleton
    public boolean addPatient(Patient patient){
        boolean status = clinic.addPatient(patient);
        if (status){
            view.showMessage("Paciente registrado con éxito");
            view.clear();
        } else {
            view.showError("No se pudo registrar el paciente por identificación duplicada");
        }
        return status;
    }

    public Patient findPatient(String id){
        Patient patient = clinic.findPatient(id);
        if (patient == null){
            view.showError("No se ha encontrado un paciente con esa identificación:( ");
            view.clear();
        } else {
            view.showData(patient);
        }
        return patient;
    }

     public boolean removePatient(String id){
        boolean status = clinic.removePatient(id);
        if (status){
            view.showMessage("Paciente eliminado correctamente");
            view.clear();
        } else {
            view.showError("No se pudo eliminar: paciente no encontrado");
        }
        return status;
    }

    public Iterator<Patient> getPatients() {
        return clinic.getPatients();
    }

    public boolean scheduleAppointment(Appointment appointment){
        boolean status = clinic.scheduleAppointment(appointment);
        if (status){
            view.showMessage("Cita agendada con exito :) ");
            view.clear();
        } else {
            view.showError("La cita no se pudo agendar");
        }
        return status;
    }

    public Appointment findAppointment(String code){
        Appointment appo = clinic.findAppointment(code);
        if (appo == null){
            view.showError("No se ha encontrado una cita agendada:( ");
            view.clear();
        } else {
            view.showData(appo);
        }
        return appo;
    }

    public boolean rescheduleAppointment(String code, LocalDate newDate, LocalTime newTime){
        boolean status = clinic.rescheduleAppointment(code, newDate, newTime);
        if (status){
            view.showMessage("La cita se ha reagendado correctamente");
        } else {
            view.showError("No se pudo reagendar la cita ");
        }
        return status;
    }

    public boolean cancelAppointment(String code) {
        return clinic.cancelAppointment(code);
    }

    public Iterator<Appointment> getAppointments() {
        return clinic.getAppointments(); 
    }

    public boolean checkInPatient(String patientId) {
        boolean status = clinic.checkInPatient(patientId);
        if (status) {
            view.showMessage("Registro se completo el checkIn");
        } else {
            view.showError("No se completo el checkIn, el paciente no tiene cita registrada");
        }
        return status;
    }

    public Patient getNextPatient() {
        Patient pat = clinic.getNextPatient();
        if (pat == null) {
            view.showError("Ya no existen pacientes en la lista");
        }
        return pat; 
    }

    public Patient attendNextPatient() {
        Patient pat = clinic.getNextPatient();
        if (pat == null) {
            view.showError("Ya no existen pacientes en la lista de espera");
        } else {
            clinic.attendNextPatient();
        }
        return pat;
    }

    public int getWaitingPatientCount() {
        return clinic.getWaitingPatientCount();
    }

    public boolean isPatientWaiting(String patientId) {
        return clinic.isPatientWaiting(patientId);
    }
}