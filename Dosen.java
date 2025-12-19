/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myclass;

/**
 *
 * @author Sani Rahmatani
 */

public abstract class Dosen {
    protected String nidn;
    protected String nama;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    // METHOD ABSTRACT
    public abstract void absen();

    // METHOD BIASA
    public void tampilData() {
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
    }
}
