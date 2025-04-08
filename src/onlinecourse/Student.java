/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinecourse;

/**
 *
 * @author Windows
 */
public class Student extends User { // Deklarasi kelas Student yang mewarisi (extends) kelas User
    private int studentId; // Variabel instance privat untuk menyimpan ID mahasiswa, menerapkan enkapsulasi
    
    // Konstruktor kelas Student dengan parameter name, email, dan studentId
    public Student(String name, String email, int studentId) {
        super(name, email); // Memanggil konstruktor kelas induk (User) untuk menginisialisasi name dan email
        this.studentId = studentId; // Menginisialisasi variabel studentId dengan nilai dari parameter
    }
    // Getter untuk studentId, memungkinkan akses ke variabel privat studentId
    public int getStudentId() {
        return studentId; // Mengembalikan nilai studentId
    }
    
    @Override
    public void displayInfo() { // Metode untuk menampilkan informasi student
        // Mencetak informasi student: nama, email, dan ID
        System.out.println("Student: " + name + ", Email: " + email + ", ID: " + studentId);
    }
}
