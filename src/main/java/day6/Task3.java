package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Марьиванна", "Литература");
        Student student = new Student("Васечкин");
        teacher.evaluate(student);
    }
}
