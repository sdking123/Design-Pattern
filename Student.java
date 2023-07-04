public class Student {
    private String batchname;
    private double avgbatchPSP;
    private String instructorname;
    private String monthOfEnrollment;
    private String currentmodule;
    private String name;
    private String phonenumber;

    public Student copy(){
        Student student = new Student();
        student.name = this.name;
        student.avgbatchPSP = this.avgbatchPSP;
        student.batchname = this.batchname;
        student.instructorname = this.instructorname;
        student.monthOfEnrollment = this.monthOfEnrollment;
        student.currentmodule = this.currentmodule;
        return student;
    }

    public Student(){

    }

    public Student(String batchname, double avgbatchPSP, String instructorname, String monthOfEnrollment, String currentmodule, String name, String phonenumber) {
        this.batchname = batchname;
        this.avgbatchPSP = avgbatchPSP;
        this.instructorname = instructorname;
        this.monthOfEnrollment = monthOfEnrollment;
        this.currentmodule = currentmodule;
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public double getAvgbatchPSP() {
        return avgbatchPSP;
    }

    public void setAvgbatchPSP(double avgbatchPSP) {
        this.avgbatchPSP = avgbatchPSP;
    }

    public String getInstructorname() {
        return instructorname;
    }

    public void setInstructorname(String instructorname) {
        this.instructorname = instructorname;
    }

    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }

    public void setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
    }

    public String getCurrentmodule() {
        return currentmodule;
    }

    public void setCurrentmodule(String currentmodule) {
        this.currentmodule = currentmodule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
