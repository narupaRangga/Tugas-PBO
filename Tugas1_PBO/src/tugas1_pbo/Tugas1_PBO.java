/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_pbo;

import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Acer-GK
 */
public class Tugas1_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = null;
        try {
            connection = koneksi.getConnection();
            if (connection != null) {
                System.out.println("Koneksi ke database berhasil!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal!");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
