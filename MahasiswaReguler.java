/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myclass;

import java.util.Scanner;

/**
 *
 * @author Sani Rahmatani
 */

public class MahasiswaReguler extends Mahasiswa {

    private int angkatan;

    // Constructor
    public MahasiswaReguler(String nim, String nama, String prodi, int angkatan) {
        super(nim, nama, prodi); // memanggil constructor Mahasiswa
        this.angkatan = angkatan;
    }

    // Override method tampilData
    @Override
    public void tampilData() {
        super.tampilData(); // tampilkan data dari Mahasiswa
        System.out.println("Angkatan : " + angkatan);
    }
}
