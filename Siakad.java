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

public class Siakad {
    public static void main(String[] args) {

        // ===== MATA KULIAH =====
        MataKuliah mk1 = new MataKuliah(
                "IF101",
                "Pemrograman Java",
                3
        );

        // ===== MAHASISWA REGULER =====
        MahasiswaReguler mhs1 = new MahasiswaReguler(
                "242011021",
                "Sani Rahmatani",
                "Informatika",
                2024
        );

        // ===== DOSEN (ABSTRACT + POLYMORPHISM) =====
        Dosen dosenLB = new DosenLB(
                "DLB001",
                "Ahmad Fauzi",
                6
        );

        Dosen dosenTetap = new DosenTetap(
                "DT001",
                "Rina Lestari",
                "Lektor"
        );

        // ===== OUTPUT =====
        System.out.println("===== SISTEM AKADEMIK (SIAKAD) =====");

        System.out.println("\n=== DATA MATA KULIAH ===");
        mk1.tampilData();

        System.out.println("\n=== DATA MAHASISWA REGULER ===");
        mhs1.tampilData();

        System.out.println("\n=== DATA DOSEN LUAR BIASA ===");
        dosenLB.tampilData();
        dosenLB.absen();

        System.out.println("\n=== DATA DOSEN TETAP ===");
        dosenTetap.tampilData();
        dosenTetap.absen();
    }
}
