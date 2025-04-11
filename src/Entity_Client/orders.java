/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Client;

/**
 *
 * @author GARRY
 */
public class orders{
    
    public orders(akun data, tickets tiket, Double totalHarga, String Jenis) {
        this.data = data;
        this.tiket = tiket;
        this.totalHarga = totalHarga;
    }
    public Double getTotalHarga() {
        return totalHarga;
    }

    public void Display() {
        System.out.println("=== DATA PESANAN ===");
        System.out.println("Nama Wali     : " + data.getNama());
        System.out.println("No Telp       : " + data.getNomorTelp());
        System.out.println("Email         : " + data.getEmail());
        System.out.println("Jenis Pesanan : " + tiket.getJenis());
        System.out.println("Total Harga   : Rp " + totalHarga);
        System.out.println();
        System.out.println("=== DETAIL TIKET ===");
        System.out.println("Nama Konser   : " + tiket.getNamaKonser());
        System.out.println("Jenis Tiket   : " + tiket.getJenis());
        System.out.println("Harga Tiket   : Rp " + tiket.getHarga());
        System.out.println("Jumlah Tiket  : " + tiket.getJumlah());
    }
    private akun data;
    private Double totalHarga;
    private tickets tiket;

}
