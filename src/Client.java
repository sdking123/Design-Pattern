public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()
                            .setId(1)
                            .setName("Subham")
                            .setGradYear(2018)
                            .setYoe(1)
                            .setPsp(87)
                            .setBatchName("LLD")
                            .build();
        System.out.println(s);


    }
}
