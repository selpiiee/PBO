
import java.util.ArrayList;
import java.time.LocalDate;

public class Patient {
    private String noMedicalRecord;
    private String name;
    private ArrayList<Consultation> consultationHistory;

    public String getNoMedicalRecord() {
        return noMedicalRecord;
    }

    public void setNoMedicalRecord(String noMedicalRecord) {
        this.noMedicalRecord = noMedicalRecord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient(String noMedicalRecord, String name) {
        this.noMedicalRecord = noMedicalRecord;
        this.name = name;
        this.consultationHistory = new ArrayList<Consultation>();
    } 

    public void addConsultation(LocalDate date, Employee doctor, Employee nurse) {
        Consultation consultation = new Consultation();
        consultation.setDate(date);
        consultation.setDoctor(doctor);
        consultation.setNurse(nurse);
        consultationHistory.add(consultation);
    }

    public String getInfo() {
        String info ="";
        info += "No Medical Record  : " + this.noMedicalRecord + "\n";
        info += "Name\t\t   : " + this.name + "\n";

        if (!consultationHistory.isEmpty()) {
            info += "Consultation History :\n";

            for (Consultation consultation : consultationHistory) {
                info += consultation.getInfo();
            }
        }

        else {
            info += "Not consultation history yet.";
        }

        info += "\n";

        return info;
    }
}
