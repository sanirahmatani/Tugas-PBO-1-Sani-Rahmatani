/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myclass;

/**
 *
 * @author Sani Rahmatani
 */

public class DosenTetap extends Dosen {

    private String jabatan;

    public DosenTetap(String nidn, String nama, String jabatan) {
        super(nidn, nama);
        this.jabatan = jabatan;
    }

    // IMPLEMENTASI METHOD ABSTRACT
    @Override
    public void absen() {
        System.out.println("Dosen Tetap " + nama + " telah melakukan absen harian.");
    }

    public void tampilJabatan() {
        System.out.println("Jabatan : " + jabatan);
    }
}
