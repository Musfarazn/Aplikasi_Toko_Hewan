import java.util.Scanner; //pernyataan Java yang digunakan untuk mengimport kelas Scanner dari paket java.util. 
class kucinglayanan { //digunakan untuk menciptakan sebuah kelas baru dalam Java

    String[]layanan; ////tipe data yang menampung kumpulan karakter

    public kucinglayanan(){ //adalah pernyataan Java yang mendefinisikan konstruktor untuk kelas "kucingLayanan".
        layanan = new String[10]; //adalah membuat sebuah array baru yang berisi string dengan ukuran 10 dan menugaskannya ke sebuah variabel 
        layanan[0]="1.Vaksinasi = 80.000"; //dalah pernyataan Java yang menugaskan nilai "1.Vaksinasi = 80.000" ke elemen pertama dari sebuah array yang disebut "layanan". 
        layanan[1]="2.Perawatan = 100.000"; //dalah pernyataan Java yang menugaskan nilai "2.Perawatan = 100.000" ke elemen pertama dari sebuah array yang disebut "layanan". 
        layanan[2]="3.Penitipan = 60.000"; //dalah pernyataan Java yang menugaskan nilai "3.Penitipan = 60.000" ke elemen pertama dari sebuah array yang disebut "layanan". 
    }
    void Layanan(){ //adalah pernyataan Java yang mendefinisikan sebuah metode bernama "Layanan" dalam kelas Java.

        int i; //adalah pernyataan Java yang menyatakan sebuah variabel bernama "i" yang bertipe "int". 
        kucinglayanan K1 = new kucinglayanan(); //adalah pernyataan Java yang membuat objek baru kelas "kucinglayanan".
        System.out.println("========================================");
        System.out.println("Layanan Yang Bisa di Dapatkan : "); //Kode ini mencetak string "Layanan Yang Bisa di Dapatkan : " ke console.
        for(i = 0 ; i <= 2 ; i ++) //adalah pernyataan Java yang membuat sebuah loop yang akan mengeksekusi sebuah blok kode berkali-kali. 
        {
           System.out.println(K1.layanan[i]); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
        }
        System.out.println("========================================");
}
void pembayaran(){ //adalah pernyataan Java yang mendefinisikan sebuah metode bernama "Pembayaran" dalam kelas Java.
    Scanner bayar = new Scanner(System.in); //adalah pernyataan Java yang membuat objek baru kelas "Scanner" dan menugaskannya ke variabel "bayar". 
    System.out.print("!! PISAHKAN PILHAN DENGAN MENGGUNAKAN SPASI !! "); //adalah pernyataan Java yang mencetak sebuah string ke console tanpa menambahkan baris baru setelah string
    System.out.println(); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
    System.out.print("Masukkan pilihan Anda : "); //adalah pernyataan Java yang mencetak sebuah string ke console tanpa menambahkan baris baru setelah string
    String Memilih = bayar.nextLine(); //adalah pernyataan Java yang membuat sebuah variabel string baru yang disebut "Memilih" dan menugaskannya nilai dari baris teks berikutnya yang dimasukkan oleh pengguna menggunakan objek Scanner yang disebut "bayar".
    System.out.println("========================================");
    int tanggapan; //adalah pernyataan Java yang menyatakan sebuah variabel bernama "tanggapan" yang bertipe "int". 

    int TotalBayar = 0; //adalah pernyataan Java yang menyatakan sebuah variabel bernama "TotalBayar" dengan jumlah"= 0" yang bertipe "int". 
    String[] pilihanArray = Memilih.split(" "); //adalah pernyataan Java yang membuat sebuah array baru dari string yang disebut "pilihanArray" dan menugaskannya hasil pemotongan string yang disimpan dalam variabel "Memilih" menjadi array dari substring berdasarkan pembatas.
    for (String p : pilihanArray) { //adalah pernyataan Java yang membuat sebuah "for" loop yang menyebutkan elemen-elemen dari array string yang disebut "pilihanArray".
      int pilihanInt = Integer.parseInt(p); //adalah pernyataan Java yang mengubah objek String (p) menjadi integer (pilihanInt).
      switch (pilihanInt) { ////untuk menginput variabel yang akan diperiksa.
        case 1: //adalah menentukan sebuah blok kode untuk dieksekusi ketika nilai dari ekspresi "switch" cocok dengan nilai label "case". 
          TotalBayar += 80000; //adalah pernyataan Java yang digunakan untuk menambahkan nilai ke sebuah variabel. 
          System.out.println("Anda Memilih Layanan Vaksinasi Dengan Harga = 80.000"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
          System.out.println(); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
          break; //adalah pertnyataan istirahat
        case 2: //adalah menentukan sebuah blok kode untuk dieksekusi ketika nilai dari ekspresi "switch" cocok dengan nilai label "case". 
          TotalBayar += 100000; //adalah pernyataan Java yang digunakan untuk menambahkan nilai ke sebuah variabel. 
          System.out.println("Anda Memilih layanan Perawatan Dengan Harga = 100.000"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
          System.out.println(); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
          break; //adalah pertnyataan istirahat
        case 3: //adalah menentukan sebuah blok kode untuk dieksekusi ketika nilai dari ekspresi "switch" cocok dengan nilai label "case". 
          TotalBayar += 60000; //adalah pernyataan Java yang digunakan untuk menambahkan nilai ke sebuah variabel.
          System.out.println("Anda Memilih Layanan Penitipan Dengan Harga = 60.000"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
          System.out.println(); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
          break; //adalah pertnyataan istirahat
        default: //dapat digunakan dalam pernyataan switch untuk pernyataan yang akan dieksekusi jika case tidak sesuai dengan nilai yang ditentukan
          System.out.println("Pilihan tidak tersedia"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
          break; //adalah pertnyataan istirahat
      }
      
    }
    System.out.println("====================="); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
    System.out.println("TOTAL HARGA : " + TotalBayar); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
    System.out.println("====================="); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.

    System.out.println("Apakah Anda Ingin Mengulang Pemilihan layanan ?"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
    System.out.println("1.Iya "); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
    System.out.println("2.Tidak "); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
    System.out.print("Jawab : ");   //adalah pernyataan Java yang mencetak sebuah string ke console tanpa menambahkan baris baru setelah string
    tanggapan = bayar.nextInt(); //adalah pernyataan Java yang digunakan untuk membaca input integer dari pengguna. 

    if(tanggapan == 1){ // adalah pernyataan kondisional Java yang digunakan untuk mengeksekusi sebuah blok kode hanya jika suatu kondisi terpenuhi. 
        System.out.println("Anda Akan Kembali Kemenu Pemilihan Layanan"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
        Layanan(); //adalah pernyataan Java yang memanggil sebuah metode bernama Layanan. 
        pembayaran(); //adalah pernyataan Java yang memanggil sebuah metode bernama pembayaran.
    }

    else if (tanggapan == 2){ //adalah pernyataan kondisional Java yang digunakan untuk mengeksekusi sebuah blok kode hanya jika suatu kondisi terpenuhi.
        System.out.println("Terimakasi Atas Kepercayaannya Kepada Kami"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
        System.out.println("GoodBye"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
        
    }
    System.out.println("========================================"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.
    System.out.println("========================================"); //adalah pernyataan Java yang mencetak elemen pada indeks yang ditentukan dari array ke console.

}
}
