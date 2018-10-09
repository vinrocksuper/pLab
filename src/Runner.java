public class Runner {
    public static Student randomStudent()
    {

        String[] first = {"Elsie","Zaniyah","Isabell","Bennett","Ahmed" };
        String[] last = {"Mccormick","Chandler","Walsh","Dixon","Bob"};

        Student stude = new Student((Math.random()*5),first[((int)(Math.random()*5))],last[(int)(Math.random()*5)]);
        return stude;
    }

    public static void main(String[] args)
    {
        Teacher teach = new Teacher("Bob", "Dylan","Math","Mr.");

        Student[] students = new Student[5];
        for(int i = 0;i<5;i++)
        {
            students[i] = randomStudent();

        }
        Classroom classroom = new Classroom(students,teach);
        System.out.println(classroom.classAverage());
        classroom.printClass();
    }

}
//,"West","Berry","Ball","Atkinson","Flynn","Mueller","Conner","Keith"
//,"Kaylyn","Emilie","Tamara","Harper","Amaya","Cade","Cade"