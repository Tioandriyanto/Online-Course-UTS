/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbproject/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinecourse; 

import java.util.ArrayList; // Mengimpor kelas ArrayList dari package java.util untuk menyimpan daftar student

/**
 *
 * @author Windows
 */
public class Course implements CourseManagement { // Deklarasi kelas Course yang mengimplementasikan interface CourseManagement
    private String courseName; // Variabel instance privat untuk menyimpan nama kursus, menerapkan enkapsulasi
    private Instructor instructor; // Variabel instance privat untuk menyimpan objek Instructor yang mengajar kursus
    private ArrayList<Student> students; // Variabel instance privat untuk menyimpan daftar student dalam bentuk ArrayList
    
    // Konstruktor kelas Course dengan parameter courseName dan instructor
    public Course(String courseName, Instructor instructor) {
        this.courseName = courseName; // Menginisialisasi nama kursus dengan nilai dari parameter
        this.instructor = instructor; // Menginisialisasi instructor dengan objek Instructor yang diberikan
        this.students = new ArrayList<>(); // Menginisialisasi ArrayList students sebagai daftar kosong
    }
    
    @Override // Menandakan bahwa metode ini mengimplementasikan metode dari interface CourseManagement
    public void enrollStudent(Student student) { // Metode untuk mendaftarkan student ke dalam kursus
        students.add(student); // Menambahkan objek student ke dalam ArrayList students
        System.out.println(student.name + " enrolled in " + courseName); // Mencetak pesan konfirmasi pendaftaran
    }
    
    @Override // Menandakan bahwa metode ini mengimplementasikan metode dari interface CourseManagement
    public void displayCourseInfo() { // Metode untuk menampilkan informasi kursus
        // Mencetak nama kursus dan nama instructor
        System.out.println("Course: " + courseName + " | Instructor: " + instructor.name);
        System.out.println("Enrolled Students:"); // Mencetak header untuk daftar student
        for (Student s : students) { // Looping melalui ArrayList students untuk menampilkan setiap student
            System.out.println("- " + s.name); // Mencetak nama student dengan format daftar
        }
    }
}