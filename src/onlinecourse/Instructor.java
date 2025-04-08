/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinecourse;

/**
 *
 * @author Windows
 */
public class Instructor extends User { // Deklarasi kelas Instructor yang mewarisi (extends) kelas User
    private String expertise; // Variabel instance privat untuk menyimpan keahlian instructor
    
    // Konstruktor kelas Instructor dengan parameter name, email, dan expertise
    public Instructor(String name, String email, String expertise) {
        super(name, email); // Memanggil konstruktor kelas induk (User) untuk menginisialisasi name dan email
        this.expertise = expertise; // Menginisialisasi variabel expertise dengan nilai dari parameter
    }
    
    @Override
    public void displayInfo() { // Metode untuk menampilkan informasi instructor
        // Mencetak informasi instructor: nama, email, dan keahlian
        System.out.println("Instructor: " + name + ", Email: " + email + ", Expertise: " + expertise);
    }
}