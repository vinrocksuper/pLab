public class Teacher extends Person {
    private String subject;
    private String title;

    public Teacher(String firstName, String familyName,String Subject, String Title){
        super(firstName, familyName);
        this.subject = Subject;
        this.title = Title;
    }

    public String getFirstName(){

        return this.firstName;
    }
    public String getFamilyName()
    {
        return this.familyName;
    }
    public String getSubject()
    {
        return this.subject;
    }
    public String toString()
    {
        return this.title + familyName;
    }


}
