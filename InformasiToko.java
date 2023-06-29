
public class InformasiToko extends TokoHewan { //ini merupakan method untuk class InformasiToko 
                                              //extends digunakan untuk mewariskan method dan property dari kelas induknya
    @Override // stilah "override" biasanya merujuk pada kemampuan sebuah kelas atau objek untuk menimpa (atau "mengoverride") metode yang diwariskan dari kelas atau objek lainnya dan dapat membuat kelas menjadi lebih spesifik.
   public void InformasiTokoHewan(){  //void adalah method yang tidak memiliki nilai kembali/return  
        
        Nama = "Toko Hewan Sijabat"; //variabel nama dari toko
        Alamat = "Jl.Kuranji"; //variabel alamat dari toko
        Jenis = "Kucing"; //variabel jenis hewan yang ada
        JamBuka = "10.00-22.00"; //variabel jam buka toko
        telp = 834526722;  //variabel nomor telpon toko
        System.out.println();
        System.out.println("========================================");
        System.out.println("INFORMASI TOKO HEWAN KAMI");
        System.out.println("----------------------------------------");
        System.out.println("Nama Toko Hewan          : " + Nama);
        System.out.println("Alamat Toko              : " + Alamat);
        System.out.println("Jenis Hewan yang dijual  : " + Jenis);
        System.out.println("Jam Buka Toko            : " + JamBuka + "WIB");
        System.out.println("Nomor Telpon : +62" + telp);
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
} // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

