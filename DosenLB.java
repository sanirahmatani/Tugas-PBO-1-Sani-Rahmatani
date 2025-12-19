/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myclass;

/**
 *
 * @author Sani Rahmatani
 */

public class DosenLB extends Dosen {

    private int jumlahSKS;

    public DosenLB(String nidn, String nama, int jumlahSKS) {
        super(nidn, nama);
        this.jumlahSKS = jumlahSKS;
    }

    // IMPLEMENTASI METHOD ABSTRACT
    @Override
    public void absen() {
        System.out.println("Dosen LB " + nama + " melakukan absen perkuliahan.");
    }

    public void tampilSKS() {
        System.out.println("Jumlah SKS : " + jumlahSKS);
    }
}
