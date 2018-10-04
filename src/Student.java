public class Student extends Person{
    private double GPA;

public Student(double GPA, String firstName, String familyName){
        super(firstName,familyName);
        this.GPA=GPA;


    }
    public double getGPA(){
        return(this.GPA);

    }
    public String getFirstName(){
        return(this.firstName);
    }
    public String getFamilyName()
    {
        return(this.familyName);
    }
    public String toString(){
    return(familyName + ", " + firstName);
    }

}
