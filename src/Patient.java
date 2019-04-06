/**
 * This class represents the patient with his name, disease and priority
 */
public class Patient implements Comparable<Patient> {

    /**
     * Name of patient
     */
    private String name;
    /**
     * Type of disease
     */
    private String disease;
    /**
     * Priority from A to E
     */
    private String priority;


    /**
     * Constructor
     * @param name
     * @param disease
     * @param priority
     */
    public Patient(String name, String disease, String priority){
        this.name = name;
        this.disease = disease;
        this.priority = priority;
    }

    /**
     * @return this priority
     */
    public String getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Patient patient) {
        return this.getPriority().compareTo(patient.getPriority());

    }

    /**
     * @return print of patient
     */
    public String getInfo(){
        return name + " " + disease;
    }
}
