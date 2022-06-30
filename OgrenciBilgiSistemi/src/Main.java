public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");


        Teacher t1 = new Teacher("Kadir Hoca", "0000", "MAT");
        Teacher t2 = new Teacher("Omer Hoca", "1111", "FZK");
        Teacher t3 = new Teacher("Ilknur Hoca", "2222", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Muslum", 4, "123", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addSozluNote(100,58,90);
        s1.isPass();
        s1.printNote();

        Student s2 = new Student("Orhan", 4, "124", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s1.addSozluNote(100,90,80);
        s2.isPass();
        s2.printNote();

        Student s3 = new Student("Ferdi", 4, "125", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s1.addSozluNote(90,60,70);
        s3.isPass();
        s3.printNote();
    }
}