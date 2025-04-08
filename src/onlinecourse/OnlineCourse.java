/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinecourse;

/**
 *
 * @author Windows
 */
public class OnlineCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek instructor dengan nama, email, dan spesialisasi
        Instructor instructor = new Instructor("Mrs. Nur Aini", "nuraini@gmail.com", "Java Programming");
        
        // Membuat objek student1, student2, student3 dengan nama, email, dan ID mahasiswa
        Student student1 = new Student("Zidni", "zidni01@gmail.com", 045);
        Student student2 = new Student("Aufa", "aufa3fa@gmail.com", 047);
        Student student3 = new Student("Tio", "tio@gmail.com", 055);
        
        // Membuat objek course dengan nama kursus dan instructor yang bertanggung jawab
        Course course = new Course("Object-Oriented Programming", instructor);
        
        // Menambahkan student1, student2, student3 ke dalam kursus menggunakan metode enrollStudent
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        course.enrollStudent(student3);
        
        // Menampilkan informasi kursus (nama kursus, instructor, dan daftar siswa) menggunakan metode displayCourseInfo
        course.displayCourseInfo();
    }
    
}
