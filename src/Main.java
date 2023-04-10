public class Main{

    public static void main(String[] args) 
    {

        Teacher t001 = new Teacher("Ahmet","Matematik","0555555");
        Teacher t002 = new Teacher("Ayşegül","Hukuk","05078919191");
        Teacher t003 = new Teacher("Cihan","Engineering","05078919191");
        
        t001.print();
        t002.print();
        t003.print();

        Course hukuk = new Course("Hukuk","HKK", "001",t001);
        hukuk.addTeacher(t002);
        Course engineering = new Course("Engineering","ENG", "002",t002);
        engineering.addTeacher(t003);
        Course matematik = new Course("Matematik","MAT", "003", t003);
        matematik.addTeacher(t001);

        hukuk.printTeacher();
        engineering.printTeacher();
        matematik.printTeacher();


        Student s1 = new Student("Ahmet KARACA", "1", "3", hukuk, engineering, matematik);
        s1.addBulExamnote(10, 56,82);
        s1.isPass();

        Student s2 = new Student("Sakin Ömer", "2", "3", hukuk, engineering, matematik);
        s2.addBulExamnote(100, 100,90);
        s2.isPass();



    }
}