/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplikasi_Restoran_Sederhana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class menu implements ActionListener {

    private menu_masakan formMenuMasakan;

    public menu(menu_masakan formMenuMasakan) {
        this.formMenuMasakan = formMenuMasakan;
        this.formMenuMasakan.btn_input.addActionListener(this);
        this.formMenuMasakan.btn_update.addActionListener(this);
        this.formMenuMasakan.btn_delete.addActionListener(this);
        this.formMenuMasakan.btn_menu_registrasi.addActionListener(this);
        this.formMenuMasakan.btn_logout.addActionListener(this);
        this.formMenuMasakan.jButton6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formMenuMasakan.btn_input) {
            inputData();
        } else if (e.getSource() == formMenuMasakan.btn_update) {
            updateData();
        } else if (e.getSource() == formMenuMasakan.btn_delete) {
            deleteData();
        } else if (e.getSource() == formMenuMasakan.btn_menu_registrasi) {
            openRegistrasiMenu();
        } else if (e.getSource() == formMenuMasakan.btn_logout) {
            logout();
        } else if (e.getSource() == formMenuMasakan.jButton6) {
            openTransaksiMenu();
        }
    }

    private void inputData() {
        // Implementasi logika input data di sini
        JOptionPane.showMessageDialog(formMenuMasakan, "Input data berhasil!");
    }

    private void updateData() {
        // Implementasi logika update data di sini
        JOptionPane.showMessageDialog(formMenuMasakan, "Update data berhasil!");
    }

    private void deleteData() {
        // Implementasi logika delete data di sini
        JOptionPane.showMessageDialog(formMenuMasakan, "Delete data berhasil!");
    }

    private void openRegistrasiMenu() {
        // Implementasi logika untuk membuka menu registrasi di sini
        JOptionPane.showMessageDialog(formMenuMasakan, "Membuka menu registrasi...");
    }

    private void logout() {
        try {
            Login log = new Login();
            log.setVisible(true);
            formMenuMasakan.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(menu_masakan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void openTransaksiMenu() {
        // Implementasi logika untuk membuka menu transaksi di sini
        JOptionPane.showMessageDialog(formMenuMasakan, "Membuka menu transaksi...");
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu_masakan formMenuMasakan = new menu_masakan();
                new menu(formMenuMasakan);
                formMenuMasakan.setVisible(true);
            }
        });
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setMenuBasedOnRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

