package Jobsheet4.Hospital;

import java.util.ArrayList;
import java.time.LocalDate;

public class Patient {
    private String noRekamMedis;
    private String name;
    private ArrayList<Consultation> historyConsultation;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient(String noRekamMedis, String name) {
        this.noRekamMedis = noRekamMedis;
        this.name = name;
        this.historyConsultation = new ArrayList<Consultation>();
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis      : " + this.noRekamMedis + "\n";
        info += "Name                : " + this.name + "\n";

        if (!historyConsultation.isEmpty()) {
            info += "Consultation History:\n";
            
            for (Consultation consult : historyConsultation) {
                info += consult.getInfo();
            }
        } else {
            info += "There is No Consultation History";
        }

        info += "\n";

        return info;
    }

    public void  addConsultation(LocalDate date, Employee doctor, Employee nurse) {
        Consultation consult = new Consultation();
        consult.setDate(date);
        consult.setDoctor(doctor);
        consult.setNurse(nurse);
        historyConsultation.add(consult);
    }
}
