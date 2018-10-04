public class Classroom {
    Person[] students;
    Person teacher;

    public Classroom (Person[] students, Person teacher){
        this.students = students;
        this.teacher = teacher;
    }

    public getSubject(){
        return teacher.getSubject();
    }

    public classAverage(){

    }

    public printClass(){

    }
}
