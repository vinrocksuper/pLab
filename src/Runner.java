public class Runner {
    public static void main(String[] args)
    {
        Teacher teach = new Teacher("Bob", "Dylan","Math","Mr.");
     //   Person stude = new Student(89.99, "Dylan","Math");
        Student[] students = new Student[5];
        String[] first = {"Elsie","Zaniyah","Isabell","Bennett","Ahmed" };
        String[] last = {"Mccormick","Chandler","Walsh","Dixon","Bob"};

        for(int i = 0;i<5;i++)
        {
            students[i] = new Student((Math.random()*5),first[i],last[(int)(Math.random()*4)]);

        }
        Classroom classroom = new Classroom(students,teach);
        System.out.println(classroom.classAverage());
        classroom.printClass();
    }

}
//,"West","Berry","Ball","Atkinson","Flynn","Mueller","Conner","Keith"
//,"Kaylyn","Emilie","Tamara","Harper","Amaya","Cade","Cade"