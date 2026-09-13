package Jobsheet4;

import java.time.LocalDate;

public class Consultation {
    private LocalDate date;
    private Employee doctor;
    private Employee nurse;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Employee getNurse() {
        return nurse;
    }

    public void setNurse(Employee nurse) {
        this.nurse = nurse;
    }

    public String getInfo() {
        String info = "";
        info += "\t Date: " + date;
        info += ", Doctor: " + doctor.getInfo();
        info += ", Nurse: " + nurse.getInfo();
        info += "\n";

        return info;
    }
}
