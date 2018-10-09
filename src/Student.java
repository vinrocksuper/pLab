public class Student extends Person{
    private double GPA;
    private double MATHAVG;
    private double ELAAVG;

public Student(double GPA, String firstName, String familyName){
        super(firstName,familyName);
        this.GPA=GPA;
        this.MATHAVG=MATHAVG;
        this.ELAAVG=ELAAVG;


    }
    public double getGPA(){
        return(this.GPA);

    }
    public double getMATHAVG()
    {
        return(this.MATHAVG);
    }
    public double getELAAVG()
    {
        return(this.ELAAVG);
    }
    public String getFirstName(){
        return(this.firstName);
    }
    public String getFamilyName()
    {
        return(this.familyName);
    }
    public String toString(){
    return(familyName + ", " + firstName + "\n");
    }

}
