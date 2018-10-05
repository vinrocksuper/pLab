public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom (Student[] students, Teacher teacher){
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject(){
        return this.teacher.getSubject();
    }

    public classAverage(){
        return students[0].familyName;
    }

    public printClass(){

    }
}
