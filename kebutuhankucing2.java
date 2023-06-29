import java.util.Scanner; // Baris ini digunakan untuk memasukkan kelas Scanner ke dalam program. 
                          // Kelas Scanner untuk membaca input dari keyboard, file, atau sumber input lainnya.
public class kebutuhankucing2 { //Kelas dengan nama kebutuhankucing2 ini bersifat publik.

    void pilihkebutuhan(){ // Method pilihkebutuhan() hanya menjalankan kode didalamnya tanpa mengembalikan nilai apapun (tipe data void). 
        int pilihan; // Baris ini menunjukkan Variabel bernama pilihan dengan tipe data integer.
        Scanner data = new Scanner(System.in); // Baris ini membuat objek baru yaitu variabel data dari kelas scanner.
        System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        System.out.println("1. Makanan");// Perintah untuk menampilkan teks "1. Makanan" ke layar.
        System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
        System.out.println("2. Perlengkapan");// Perintah untuk menampilkan teks "2. Perlengkapan" ke layar.
        System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
        System.out.print("Masukan Pilihan : "); // Perintah untuk menampilkan teks "Masukkan Pilihan :" ke layar.
        pilihan = data.nextInt(); // Baris kode tersebut merupakan perintah untuk membaca input dari pengguna dan menyimpan nilainya ke dalam variabel bernama pilihan.
        System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        if (pilihan == 1){ // Dengan menggunakan perintah if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 1.
            makanan(); // Perintah untuk menjalankan method bernama makanan() yang terdapat dalam kelas yang sama.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

        else if (pilihan == 2){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 2.
            perlengkapan();// Perintah untuk menjalankan method bernama perlengkapan() yang terdapat dalam kelas yang sama.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
    void makanan(){ // // Method makanan() hanya menjalankan kode didalamnya tanpa mengembalikan nilai apapun (tipe data void).
        Scanner pilihmakan = new Scanner(System.in); // Baris ini membuat objek baru yaitu variabel pilihmakan dari kelas scanner.
        Kebutuhankucing makanan = new Kebutuhankucing("1.whiskas","2.K-Meo", "3.Royal Canin"); // Baris ini membuat objek baru yaitu variabel makanan dari kelas Kebutuhankucing dan mengisi data di parameter dengan data "1.whiskas", "2.K-Meo", dan "3.Royal Canin".
        System.out.println("Makanan Kucing : "); // Perintah untuk menampilkan teks "Makanan Kucing : " ke layar.
        System.out.println(""+makanan.getkebutuhan1()+" 6000"); // Perintah untuk menampilkan teks  perintah untuk mencetak teks diikuti dengan nilai yang dikembalikan
                                                                // oleh method getkebutuhan1() dari objek makanan diikuti dengan teks "6000" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks berupa baris kosong ke layar.
        System.out.println(""+makanan.getkebutuhan2()+" 18.000");// Perintah untuk menampilkan teks  perintah untuk mencetak teks diikuti dengan nilai yang dikembalikan
                                                                 // oleh method getkebutuhan2() dari objek makanan diikuti dengan teks "18000" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.println(""+makanan.getkebutuhan3()+" 45.000"); // Perintah untuk menampilkan teks  perintah untuk mencetak teks diikuti dengan nilai yang dikembalikan
                                                                  // oleh method getkebutuhan3() dari objek makanan diikuti dengan teks "45000" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.println("!! PISAHKAN PILIHAN DENGAN MENGGUNAKAN SPASI !! "); // Perintah untuk menampilkan teks "!! PISAHKAN PILIHAN DENGAN MENGGUNAKAN SPASI !! " ke layar.
        System.out.print("Pilih Makanan : "); // Perintah untuk menampilkan teks "Pilih Makanan : " ke layar.
        String makan = pilihmakan.nextLine(); // perintah untuk memecah sebuah String yang disimpan dalam variabel pilihmakan dan menyimpan hasil pemecahan tersebut dalam sebuah variabel bernama makan.
        System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        int jawaban; // Baris ini menunjukkan Variabel bernama jawaban dengan tipe data integer.

        int totalharga = 0; // Baris ini menunjukkan Variabel bernama totalharga yang bernilai awal 0 dengan tipe data integer.
        String[] pilihanArray = makan.split(" "); // perintah untuk memecah sebuah String yang disimpan dalam variabel makan menjadi sekumpulan String yang dipisahkan oleh spasi (" ") dan menyimpan hasil pemecahan tersebut dalam sebuah array bernama pilihanArray.
        for (String p : pilihanArray) { // Perintah perulangan for untuk mengeksekusi kode yang terdapat di dalamnya sebanyak element yang terdapat di dalam array pilihanArray dan setiap element disimpan dalam variabel p.
          int pilihanInt = Integer.parseInt(p); // Mengubah sebuah String yang disimpan dalam variabel p menjadi sebuah integer dan menyimpan hasil konversi tersebut dalam variabel pilihanInt. Method parseInt() akan mengembalikan sebuah integer yang merupakan hasil konversi dari sebuah String yang ditentukan.
          switch (pilihanInt) { // Switch statements untuk mengeksekusi beberapa kondisi dengan parameter pilihanInt berdasarkan nilai kondisi yang diinput.
            case 1: // Case 1 merupakan kondisi pertama dan bagian dari perintah Switch-case.
              totalharga+= 8000; // Perintah untuk menambahkan nilai 8000 ke dalam variabel totalharga.
              System.out.println("Whiskas = 8000"); // Perintah untuk menampilkan teks "Whiskas = 8000" ke layar.
              System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 2: // Case 2 merupakan kondisi kedua dan bagian dari perintah Switch-case.
              totalharga+= 18000; // Perintah untuk menambahkan nilai 18000 ke dalam variabel totalharga.
              System.out.println("K-Meo = 18.000"); // Perintah untuk menampilkan teks "K-Meo = 18.000" ke layar.
              System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 3: // Case 3 merupakan kondisi ketiga dan bagian dari perintah Switch-case.
              totalharga+= 45000;// Perintah untuk menambahkan nilai 8000 ke dalam variabel totalharga.
              System.out.println("Royal Canin = 45.000"); // Perintah untuk menampilkan teks "Royal Canin = 45.000" ke layar.
              System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            default:
              System.out.println("Pilihan tidak tersedia"); // Perintah untuk menampilkan teks "Pilihan tidak tersedia" ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
          } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
        System.out.println("================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        System.out.println("Total Pembelian = "+totalharga); // Perintah untuk menampilkan teks "Total Pembelian =" diikuti dengan nilai variabel totalharga ke layar.
        System.out.println("================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.println("Apakah Anda Ingin : "); // Perintah untuk menampilkan teks "Apakah Anda Ingin : " ke layar.
        System.out.println("1. Menukar  "); // Perintah untuk menampilkan teks "1. Menukar" ke layar.
        System.out.println("2. Beli Perlengkapan "); // Perintah untuk menampilkan teks "2. Beli Perlengkapan" ke layar.
        System.out.println("3. Selesai "); // Perintah untuk menampilkan teks "3. Selesai" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.print("Jawaban : "); // Perintah untuk menampilkan teks "Jawaban : " ke layar.
        jawaban = pilihmakan.nextInt(); // Baris kode tersebut merupakan perintah untuk membaca input dari pengguna dan menyimpan nilainya ke dalam variabel bernama jawaban.
        if (jawaban == 1){ // Dengan menggunakan perintah if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 1.
            System.err.println("Anda Kembali ke menu pilih Makanan"); // Perintah untuk menampilkan teks "Anda Kembali ke menu pilih Makanan" ke layar.
            makanan(); // Perintah untuk menjalankan method bernama makanan() yang terdapat dalam kelas yang sama.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
        else if (jawaban == 2){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 2.
            System.out.println("Anda Akan Masuk Ke Menu Perlengkapan Kucing"); // Perintah untuk menampilkan teks "Anda Kembali ke menu Perlengkapan Kucing" ke layar.
            perlengkapan(); // Perintah untuk menjalankan method bernama perlengkapan() yang terdapat dalam kelas yang sama.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
        else if (jawaban == 3){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 3.
            System.out.println("TerimaKasih Sudah Berbelanja"); // Perintah untuk menampilkan teks "TerimaKasih Sudah Berbelanja" ke layar.
            System.out.println("GoodBye!"); // Perintah untuk menampilkan teks "GoodBye!" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

    void perlengkapan(){ // Method perlengkapan() hanya menjalankan kode didalamnya tanpa mengembalikan nilai apapun (tipe data void). 
        Scanner pilihbarang= new Scanner(System.in);
        Kebutuhankucing perlengkapan = new Kebutuhankucing("1. Sekop kotoran","2. Litter box.", "3. Pasir kucing");  // Baris ini membuat objek baru yaitu variabel perlengkapan dari kelas Kebutuhankucing dan mengisi data di parameter dengan data "1. Sekop", "2. Litter box", dan "3.Pasir Kucing".
        System.out.println("Makanan Kucing : "); // Perintah untuk menampilkan teks "Makanan Kucing" ke layar.
        System.out.println(""+perlengkapan.getkebutuhan1()+" 45.000"); // Perintah untuk menampilkan teks  perintah untuk mencetak teks diikuti dengan nilai yang dikembalikan
                                                                       // oleh method getkebutuhan1() dari objek perlengkapan diikuti dengan teks "45000" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.println(""+perlengkapan.getkebutuhan2()+" 150.000");// Perintah untuk menampilkan teks  perintah untuk mencetak teks diikuti dengan nilai yang dikembalikan
                                                                       // oleh method getkebutuhan2() dari objek perlengkapan diikuti dengan teks "150000" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.println(""+perlengkapan.getkebutuhan3()+" 110.000");// Perintah untuk menampilkan teks  perintah untuk mencetak teks diikuti dengan nilai yang dikembalikan
                                                                       // oleh method getkebutuhan3() dari objek perlengkapan diikuti dengan teks "110000" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.println("!! PISAHKAN PILIHAN DENGAN MENGGUNAKAN SPASI !! "); // Perintah untuk menampilkan teks "!! PISAHKAN PILIHAN DENGAN MENGGUNAKAN SPASI !! " ke layar.
        System.out.print("Pilih Makanan : "); // Perintah untuk menampilkan teks "Pilih Makanan : " ke layar.
        String makan = pilihbarang.nextLine(); // Perintah untuk memecah sebuah String yang disimpan dalam variabel pilihbarang dan menyimpan hasil pemecahan tersebut dalam sebuah variabel bernama makan.
        System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        int jawaban; // Baris ini menunjukkan Variabel bernama jawaban dengan tipe data integer.

        int totalharga = 0; // Baris ini menunjukkan Variabel bernama totalharga yang bernilai awal 0 dengan tipe data integer.
        String[] pilihanArray = makan.split(" "); // perintah untuk memecah sebuah String yang disimpan dalam variabel makan menjadi sekumpulan String yang dipisahkan oleh spasi (" ") dan menyimpan hasil pemecahan tersebut dalam sebuah array bernama pilihanArray.
        for (String p : pilihanArray) { // Perintah perulangan for untuk mengeksekusi kode yang terdapat di dalamnya sebanyak element yang terdapat di dalam array pilihanArray dan setiap element disimpan dalam variabel p.
          int pilihanInt = Integer.parseInt(p); // Mengubah sebuah String yang disimpan dalam variabel p menjadi sebuah integer dan menyimpan hasil konversi tersebut dalam variabel pilihanInt. Method parseInt() akan mengembalikan sebuah integer yang merupakan hasil konversi dari sebuah String yang ditentukan.
          switch (pilihanInt) { // Switch statements untuk mengeksekusi beberapa kondisi dengan parameter pilihanInt berdasarkan nilai kondisi yang diinput.
            case 1: // Case 1 merupakan kondisi pertama dan bagian dari perintah Switch-case.
              totalharga+= 45000; // perintah untuk menambahkan nilai 45000 ke dalam variabel totalharga.
              System.out.println("Sekop Kotoran = 45.000"); // Perintah untuk menampilkan teks "Sekop Kotoran = 45.000" ke layar.
              System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 2: // Case 2 merupakan kondisi kedua dan bagian dari perintah Switch-case.
              totalharga+= 150000; // perintah untuk menambahkan nilai 150000 ke dalam variabel totalharga.
              System.out.println("Litter Box = 150.000"); // Perintah untuk menampilkan teks "Litter Box = 150.000" ke layar.
              System.out.println(); // Perintah untuk menampilkan teks "baris kosong ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 3: // Case 3 merupakan kondisi ketiga dan bagian dari perintah Switch-case.
              totalharga+= 110000; // perintah untuk menambahkan nilai 110000 ke dalam variabel totalharga.
              System.out.println("Pasir Kucing = 110.000"); // Perintah untuk menampilkan teks "Pasir Kucing = 110.000" ke layar.
              System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            default: // default merupakan bagian dari perintah pengkondisian switch-case di Java.
            // Dibawah ini merupakan aksi jika menginput pilihan yang tidak valid.
              System.out.println("Pilihan tidak tersedia"); // Perintah untuk menampilkan teks "Pilihan tidak tersedia" ke layar.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
          } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
        System.out.println("================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        System.out.println("Total Pembelian = "+totalharga); // Perintah untuk menampilkan teks "Total Pembelian =" diikuti dengan nilai variabel totalharga ke layar.
        System.out.println("================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
        System.out.println("Apakah Anda Ingin : "); // Perintah untuk menampilkan teks "Apakah Anda Ingin : " ke layar.
        System.out.println("1. Menukar  "); // Perintah untuk menampilkan teks "1. Menukar" ke layar.
        System.out.println("2. Beli Makanan "); // Perintah untuk menampilkan teks "2. Beli Makanan " ke layar.
        System.out.println("3. Selesai "); // Perintah untuk menampilkan teks "3. Selesai" ke layar.
        System.out.println(); // Perintah untuk menampilkan teks baris kosong ke layar.
        System.out.print("Jawaban : "); // Perintah untuk menampilkan teks "Jawaban : " ke layar.
        jawaban = pilihbarang.nextInt(); // Baris kode tersebut merupakan perintah untuk membaca input dari pengguna dan menyimpan nilainya ke dalam variabel bernama jawaban.
        if (jawaban == 1){ // Dengan menggunakan perintah if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 1.
            System.err.println("Anda Kembali ke menu pilih perlengkapan"); // Perintah untuk menampilkan teks "Anda Akan Masuk Ke Menu Makanan Perlengkapan" ke layar.
            perlengkapan(); // Perintah untuk menjalankan method bernama perlengkapan() yang terdapat dalam kelas yang sama.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
        else if (jawaban == 2){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 2.
            System.out.println("Anda Akan Masuk Ke Menu Makanan Kucing"); // Perintah untuk menampilkan teks "Anda Akan Masuk Ke Menu Makanan Kucing" ke layar.
            makanan(); // Perintah untuk menjalankan method bernama makanan() yang terdapat dalam kelas yang sama.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
        else if (jawaban == 3){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 3.
            System.out.println("TerimaKasih Sudah Berbelanja"); // Perintah untuk menampilkan teks "TerimaKasih Sudah Berbelanja" ke layar.
            System.out.println("GoodBye!"); // Perintah untuk menampilkan teks "GoodBye!" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
        } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
} // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
