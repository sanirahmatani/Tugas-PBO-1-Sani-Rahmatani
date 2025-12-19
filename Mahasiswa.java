/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myclass;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sani Rahmatani
 */

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}
