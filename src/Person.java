public abstract class Person {
    String firstName;
    String familyName;

    public Person(String firstName, String familyName)
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public abstract String getFirstName();
    public abstract String getFamilyName();
    public abstract String toString();
    public static boolean equals(Person p){
        return(p.firstName.equals(p.familyName));
    }


}

