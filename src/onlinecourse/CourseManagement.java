/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package onlinecourse;

/**
 *
 * @author Windows
 */
public interface CourseManagement { // Deklarasi interface CourseManagement untuk mendefinisikan kontrak metode
    // Deklarasi metode abstrak untuk mendaftarkan student ke dalam kursus
    void enrollStudent(Student student);
    void displayCourseInfo(); // Deklarasi metode abstrak untuk menampilkan informasi kursus
}
