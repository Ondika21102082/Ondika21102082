package com.mycompany.tugas_oop;

/**
 *
 * @NIM 21102082 NAMA SILVESTER ONDIKA MAMPUR
 */
public class rumahsakit {
    private String DOKTER, SUSTER, PERAWAT, PASIEN, PEGAWAI;
    
    public void Setdok(String dokter){
        this.DOKTER = dokter;
    }
    public void SetSUSTER(String suster){
        this.SUSTER = suster;
    }
    public void SetPERAWAT(String perawat){
        this.PERAWAT = perawat;
    }
    public void SetPASIEN(String pasien){
        this.PASIEN = pasien;
    }
    public void SetPegawai(String pegawai){
        this.PEGAWAI = pegawai;
    }
    public String Getdokter(){
        return this.DOKTER;
    }
    public String Getsuster(){
        return this.SUSTER;
    }
    public String Getperawat(){
        return this.PERAWAT;
    }
    public String Getpasien(){
        return this.PASIEN;
    }
    public String Getpegawai(){
        return this.PEGAWAI;
    }

    void SetDOKTER(String NN) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void SetPEGAWAI(String NN) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
