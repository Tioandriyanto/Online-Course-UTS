/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinecourse;

/**
 *
 * @author Windows
 */
abstract class User { // Deklarasi kelas abstrak User sebagai kelas induk untuk subclass seperti Student dan Instructor
    protected String name; // Variabel instance protected untuk menyimpan nama, dapat diakses oleh subclass
    protected String email; // Variabel instance protected untuk menyimpan email, dapat diakses oleh subclass
    
    // Konstruktor kelas User dengan parameter name dan email
    public User(String name, String email) {
        this.name = name; // Menginisialisasi variabel name dengan nilai dari parameter
        this.email = email; // Menginisialisasi variabel email dengan nilai dari parameter
    }
    
    // Deklarasi metode abstrak displayInfo yang harus diimplementasikan oleh subclass
    public abstract void displayInfo();
}
