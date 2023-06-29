import java.util.Scanner; // Baris ini digunakan untuk memasukkan kelas Scanner ke dalam program. Kelas Scanner untuk membaca input dari keyboard, file, atau sumber input lainnya. 
public class Menu { //Kelas dengan nama Menu ini bersifat publik.
    public void menu(){ // Mendeklarasikan method menu() dan sebelumnya wajib menuliskan kata kunci publik dan void. 

        Scanner input = new Scanner(System.in); // Baris ini membuat objek baru yaitu variabel input dari kelas scanner.
        int pilihan; // Baris ini menunjukkan Variabel bernama pilihan dengan tipe data integer.
        do { // Do merupakan bagian dari perulangan do-while di Java yang digunakan untuk menjalankan program berulang 
             // kali sampai kondisi tertentu terselesaikan.
            System.out.println("Menu Pilihan:"); // Perintah untuk menampilkan teks "Menu Pilihan:" ke layar.
            System.out.println("1. Informasi Toko");// Perintah untuk menampilkan teks "1. Informasi Toko" ke layar.
            System.out.println("2. Adopsi Kucing"); // Perintah untuk menampilkan teks "2. Adopsi Kucing" ke layar.
            System.out.println("3. Layanan Kucing"); // Perintah untuk menampilkan teks "3. Layanan Kucing" ke layar.
            System.out.println("4. Kebutuhan Kucing"); // Perintah untuk menampilkan teks "4. Kebutuhan Kucing" ke layar.
            System.out.println("5. Keluar"); // Perintah untuk menampilkan teks "5. Keluar" ke layar.
            System.out.print("Masukkan pilihan Anda: "); // Perintah untuk menampilkan teks "Masukkan pilihan Anda: " ke layar.
            
           
            pilihan = input.nextInt(); // Perintah untuk membaca input bilangan bulat dan menyimpannya dalam variabel bernama pilihan.
            
           
            switch (pilihan) { // Switch statements untuk mengeksekusi beberapa kondisi berdasarkan nilai kondisi yang diinput.
                case 1: // Case 1 merupakan kondisi pertama dan bagian dari perintah Switch-case.
                InformasiToko H1 = new InformasiToko(); // Baris ini membuat objek baru yaitu Variabel H1 dari kelas InformasiToko.
                H1.InformasiTokoHewan(); // Baris ini menjalankan method InformasiTokoHewan() dengan variabel H1.
                break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
                case 2: // Case 2 merupakan kondisi kedua dan bagian dari perintah Switch-case.
                Kucing H2 = new Kucing(); // Baris ini membuat objek baru yaitu Variabel H2 dari kelas Kucing.
                H2.jenis();// Baris ini menjalankan method jenis() dengan variabel H2.
                break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
                case 3: // Case 3 merupakan kondisi ketiga dan bagian dari perintah Switch-case.
                kucinglayanan H3 =new kucinglayanan();   // Baris ini membuat objek baru yaitu Variabel H3 dari kelas kucinglayanan.
                H3.Layanan(); // Baris ini menjalankan method Layanan() dengan variabel H3.
                H3.pembayaran(); // Baris ini menjalankan method jpembayaran() dengan variabel H3.
                break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
                case 4: // Case 4 merupakan kondisi keempat dan bagian dari perintah Switch-case.
                kebutuhankucing2 H4 = new kebutuhankucing2(); // Baris ini membuat objek baru yaitu Variabel H4 dari kelas kebutuhankucing2.
                H4.pilihkebutuhan(); // Baris ini menjalankan method pilihkebutuhan() dengan variabel H4. 
                break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
                case 5:// Case 5 merupakan kondisi kelima dan bagian dari perintah Switch-case.
                System.out.println("Selamat Tinggal! \nAnda Telah Keluar Dari Toko Hewan Kami."); // Perintah untuk menampilkan teks 
                                                                //"Selamat Tinggal! \nAnda Telah Keluar Dari Toko Hewan Kami." ke layar.
                break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
     
        default: // default merupakan bagian dari perintah pengkondisian switch-case di Java.
        // Dibawah ini merupakan aksi jika menginput pilihan yang tidak valid.
        System.out.println("Pilihan yang Anda masukkan tidak valid");  // Perintah untuk menampilkan teks "Pilihan yang Anda masukkan tidak valid" ke layar.
        break;}// Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.

        } while (pilihan != 5); // Dengan menggunakan perintah perulangan while, Kondisi ini akan bernilai false jika pilihan yang diinput adalah kondisi 5.  
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
} // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
