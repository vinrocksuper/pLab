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

    public double classAverage(){
        double num = 0;
        for(int i = 0;i<students.length;i++){
            num+=students[i].getGPA();
        }
        return num/students.length;
    }

    public void printClass(){
        System.out.println(this.teacher.getSubject() + " Teacher: " + this.teacher);
        for(int i = 0;i<students.length;i++) {
            System.out.println(students[i].firstName + " " + students[i].familyName);
        }
    }
}
