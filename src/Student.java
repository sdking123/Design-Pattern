public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String BatchName;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.BatchName = builder.BatchName;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", BatchName='" + BatchName + '\'' +
                '}';
    }

    static class Builder {
        public int id;
        public String name; //name -> not null
        public int yoe;
        public int gradYear;
        public double psp;
        public String BatchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            BatchName = batchName;
            return this;
        }
        public void validate(){
            if(name == null){
                throw new InvalidNameException("Name should not be null");
            }
            if(yoe<1){
                throw new InvalidYOEException("YOE should not be 0");
            }
            if(gradYear>2022){
                throw new InvalidGradYearException("Grad Year should 2022 or before ");
            }
        }
        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }

}
