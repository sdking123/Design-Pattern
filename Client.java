public class Client {
    public static void main(String[] args) {
        Student studentApr23Proto = new Student();
        studentApr23Proto.setBatchname("Apr23");
        studentApr23Proto.setAvgbatchPSP(80);
        studentApr23Proto.setInstructorname("Subham");
        studentApr23Proto.setMonthOfEnrollment("0423");
        studentApr23Proto.setCurrentmodule("DSA");


        Student studentMar23Proto = new Student();
        studentMar23Proto.setBatchname("Mar23");
        studentMar23Proto.setAvgbatchPSP(85);
        studentMar23Proto.setInstructorname("ABC");
        studentMar23Proto.setMonthOfEnrollment("0323");
        studentMar23Proto.setCurrentmodule("DSA");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("Apr23" , studentApr23Proto);
        studentRegistry.register("Mar23" , studentMar23Proto);

        Student SubhamApr23 = studentRegistry.get("Apr23").copy();
        SubhamApr23.setName("Subham Das");
        SubhamApr23.setPhonenumber("1234");

        Student ABCApr23 = studentRegistry.get("Mar23").copy();
        SubhamApr23.setName("ABC");
        SubhamApr23.setPhonenumber("1434");
    }
}
