public class Runner {
    public static void main(String[] args)
    {
        Person teach = new Teacher("Bob", "Dylan","Math","Mr.");
     //   Person stude = new Student(89.99, "Dylan","Math");
        Student[] students = new Student[99];
        String[] first = {"Elsie","Zaniyah","Isabell","Bennett","Ahmed" };
        String[] last = {"Mccormick","Chandler","Walsh","Dixon","Bob"};
        double[] grade = {3,2,3,4,3,2.5};
        for(int i = 0;i<5;i++)
        {
            students[i] = new Student(grade[i],first[i],last[i]);
        }
        System.out.println(students[4]);
        System.out.println(teach);

    }

}
//,"West","Berry","Ball","Atkinson","Flynn","Mueller","Conner","Keith"
//,"Kaylyn","Emilie","Tamara","Harper","Amaya","Cade","Cade"