import java.util.Scanner; // Baris ini digunakan untuk memasukkan kelas Scanner ke dalam program. 
                          // Kelas Scanner untuk membaca input dari keyboard, file, atau sumber input lainnya. 
public class Kucing extends Menu { // Baris ini mendeklarasikan kelas di Java yang menunjukkan bahwa kelas "Kucing" merupakan kelas turunan dari kelas "Menu". Kata kunci "extends" digunakan untuk menunjukkan bahwa kelas "Kucing" adalah kelas anak dari kelas "Menu", yang disebut juga sebagai kelas "superclass" atau kelas "induk".
     
   String[]Kucing; // Baris ini merupakan sebuah array bernama Kucing di Java yang berisi elemen-elemen bertipe String.

   public Kucing(){ // Baris ini merupakan deklarasi konstruktor untuk kelas Kucing.
     Kucing= new String[10]; // Baris  ini  untuk deklarasi dan inisialisasi array bernama Kucing di Java yang berisi elemen-elemen bertipe String dengan ukuran 10 elemen.

     Kucing[0]="1.Persia"; // Ini merupakan sebuah assignment operator yang digunakan untuk mengisi elemen pertama dari array "Kucing" dengan nilai "1.Persia". Assignment operator di Java ditandai dengan simbol "=", yang digunakan untuk memberikan nilai kepada sebuah variabel atau elemen dalam array.
     Kucing[1]="2.Bengal"; // Ini merupakan sebuah assignment operator yang digunakan untuk mengisi elemen pertama dari array "Kucing" dengan nilai "2.Bengal". Assignment operator di Java ditandai dengan simbol "=", yang digunakan untuk memberikan nilai kepada sebuah variabel atau elemen dalam array.
     Kucing[2]="3.Ragdoll"; // Ini merupakan sebuah assignment operator yang digunakan untuk mengisi elemen pertama dari array "Kucing" dengan nilai "3.Ragdoll". Assignment operator di Java ditandai dengan simbol "=", yang digunakan untuk memberikan nilai kepada sebuah variabel atau elemen dalam array.
     Kucing[3]="4.British Shorthair"; // Ini merupakan sebuah assignment operator yang digunakan untuk mengisi elemen pertama dari array "Kucing" dengan nilai "4.British Shorthair". Assignment operator di Java ditandai dengan simbol "=", yang digunakan untuk memberikan nilai kepada sebuah variabel atau elemen dalam array.
     Kucing[4]="5.sphinx"; // Ini merupakan sebuah assignment operator yang digunakan untuk mengisi elemen pertama dari array "Kucing" dengan nilai "%.Sphinx". Assignment operator di Java ditandai dengan simbol "=", yang digunakan untuk memberikan nilai kepada sebuah variabel atau elemen dalam array.
     Kucing[5]="6.Tiffanie"; // Ini merupakan sebuah assignment operator yang digunakan untuk mengisi elemen pertama dari array "Kucing" dengan nilai "6.Tiffanie". Assignment operator di Java ditandai dengan simbol "=", yang digunakan untuk memberikan nilai kepada sebuah variabel atau elemen dalam array.
   } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

    void jenis(){ // Method jenis() hanya menjalankan kode didalamnya tanpa mengembalikan nilai apapun (tipe data void).   
      int i; // ini adalah variabel i bertipe integer.
      Kucing K1 = new Kucing(); // Baris ini membuat objek baru yaitu Variabel K1 dari kelas Kucing.
      System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
      System.out.println("Jenis Jenis Kucing Yang Tersedia : "); // Perintah untuk menampilkan teks "Jenis Jenis Kucing Yang Tersedia : " ke layar.
      for(i = 0 ; i <= 5 ; i ++) // Perulangan for dimana variabel i diinisialisasikan dengan nilai 0. kondisi "i <= 5" akan dievaluasi. Setelah itu variabel "i" akan diincrement dengan 1 (ditambah 1). Proses ini akan terus dilakukan sampai variabel "i" bernilai 6, yang mana kondisi "i <= 5" akan bernilai false dan perulangan akan berakhir.
      { // ini merupakan tanda kurung kurawal yang menendakan awal dari suatu kelas atau method.
         System.out.println(K1.Kucing[i]); // perintah untuk mencetak statement yang digunakan untuk mencetak nilai dari elemen ke-i dari array "Kucing" yang terdapat dalam objek "K1" ke layar.
      }// ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
      System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.

    
         
      
      Scanner input = new Scanner(System.in); // Baris ini membuat objek baru yaitu variabel input dari kelas scanner.
      System.out.print("Pilih Jenis Kucing Yang Diinginkan = "); // Perintah untuk menampilkan teks "TerimaKasih Sudah Mau Merawat dan Mencintai kucing" ke layar.
      int pilihan; // ini adalah variabel pilihan bertipe integer.
      do { // Do merupakan bagian dari perulangan do-while di Java yang digunakan untuk menjalankan program berulang 
         
         // Baca pilihan dari terminal
         pilihan = input.nextInt(); // Baris kode tersebut merupakan perintah untuk membaca input dari pengguna dan menyimpan nilainya ke dalam variabel bernama pilihan.
         
         // Lakukan aksi sesuai dengan pilihan yang dipilih
         switch (pilihan) { // Switch statements untuk mengeksekusi beberapa kondisi berdasarkan nilai kondisi yang diinput.
            case 1: // Case 1 merupakan kondisi pertama dan bagian dari perintah Switch-case.
            System.out.println("1.Kucing = persia\n  Warna = Putih\n  Umur = 8 Bulan\n  Kelamin = Betina"); // Perintah untuk menampilkan teks "1.Kucing = persia\n  Warna = Putih\n  Umur = 8 Bulan\n  Kelamin = Betina" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("2.Kucing = persia\n  Warna = Hitam\n  Umur = 5 Tahun\n  kelamin = Jantan"); // Perintah untuk menampilkan teks "2.Kucing = persia\n  Warna = Hitam\n  Umur = 5 Tahun\n  kelamin = Jantan" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("3.Kucing = persia\n  Warna = Krame\n  Umur = 7 Tahun\n  kelamin = betina"); // Perintah untuk menampilkan teks "3.Kucing = persia\n  Warna = Krame\n  Umur = 7 Tahun\n  kelamin = betina" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
            break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 2: // Case 2 merupakan kondisi kedua dan bagian dari perintah Switch-case.
            System.out.println("1.Kucing = Bengal\n  Warna = coklat\n  Umur = 9 Bulan\n  Kelamin = Betina"); // Perintah untuk menampilkan teks "1.Kucing = Bengal\n  Warna = coklat\n  Umur = 9 Bulan\n  Kelamin = Betina" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("2.Kucing = Bengal\n  Warna = perak\n  Umur = 8 Tahun\n  kelamin = Jantan"); // Perintah untuk menampilkan teks "2.Kucing = Bengal\n  Warna = perak\n  Umur = 8 Tahun\n  kelamin = Jantan" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("3.Kucing = Bengal\n  Warna = putih\n  Umur = 10 Tahun\n  kelamin = betina"); // Perintah untuk menampilkan teks "3.Kucing = Bengal\n  Warna = putih\n  Umur = 10 Tahun\n  kelamin = betina" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
            
            break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 3: // Case 3 merupakan kondisi ketiga dan bagian dari perintah Switch-case.
            System.out.println("1.Kucing = Ragdoll\n  Warna = Putih\n  Umur = 3 Bulan\n  Kelamin = Betina"); // Perintah untuk menampilkan teks "1.Kucing = Ragdoll\n  Warna = Putih\n  Umur = 3 Bulan\n  Kelamin = Betina" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("2.Kucing = Ragdoll\n  Warna = putih\n  Umur = 1 Tahun\n  kelamin = Jantan"); // Perintah untuk menampilkan teks "2.Kucing = Ragdoll\n  Warna = putih\n  Umur = 1 Tahun\n  kelamin = Jantan" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("3.Kucing = Ragdoll\n  Warna = Putih\n  Umur = 3 Tahun\n  kelamin = betina"); // Perintah untuk menampilkan teks "3.Kucing = Ragdoll\n  Warna = Putih\n  Umur = 3 Tahun\n  kelamin = betina" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
            break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 4: // Case 4 merupakan kondisi keempat dan bagian dari perintah Switch-case.
            System.out.println("1.Kucing = British\n  Warna = Putih\n  Umur = 5 Bulan\n  Kelamin = Betina"); // Perintah untuk menampilkan teks "1.Kucing = British\n  Warna = Putih\n  Umur = 5 Bulan\n  Kelamin = Betina" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("2.Kucing = British\n  Warna = Hitam\n  Umur = 6 Tahun\n  kelamin = Jantan"); // Perintah untuk menampilkan teks "2.Kucing = British\n  Warna = Hitam\n  Umur = 6 Tahun\n  kelamin = Jantan" ke layar. 
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("3.Kucing = British\n  Warna = Krame\n  Umur = 4 Tahun\n  kelamin = betina"); // Perintah untuk menampilkan teks "3.Kucing = British\n  Warna = Krame\n  Umur = 4 Tahun\n  kelamin = betina" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
           
          
            break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 5: // Case 5 merupakan kondisi kelima dan bagian dari perintah Switch-case.
            System.out.println("1.Kucing = sphinx\n  Warna = Putih\n  Umur = 9 Bulan\n  Kelamin = Betina"); // Perintah untuk menampilkan teks "1.Kucing = sphinx\n  Warna = Putih\n  Umur = 9 Bulan\n  Kelamin = Betina" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("2.Kucing = sphinx\n  Warna = Hitam\n  Umur = 2 Tahun\n  kelamin = Jantan"); // Perintah untuk menampilkan teks "2.Kucing = sphinx\n  Warna = Hitam\n  Umur = 2 Tahun\n  kelamin = Jantan" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("3.Kucing = sphinx\n  Warna = Krame\n  Umur = 1 Tahun\n  kelamin = betina"); // Perintah untuk menampilkan teks "3.Kucing = sphinx\n  Warna = Krame\n  Umur = 1 Tahun\n  kelamin = betina" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
          
           
            break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            case 6: // Case 6 merupakan kondisi keenam dan bagian dari perintah Switch-case.
            System.out.println("1.Kucing = tiffanie\n  Warna = Putih\n  Umur = 10 Bulan\n  Kelamin = Betina"); // Perintah untuk menampilkan teks "1.Kucing = tiffanie\n  Warna = Putih\n  Umur = 10 Bulan\n  Kelamin = Betina" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("2.Kucing = tiffanie\n  Warna = Hitam\n  Umur = 9 Tahun\n  kelamin = Jantan"); // Perintah untuk menampilkan teks "2.Kucing = tiffanie\n  Warna = Hitam\n  Umur = 9 Tahun\n  kelamin = Jantan" ke layar.
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("3.Kucing = tiffanie\n  Warna = Krame\n  Umur = 4 Tahun\n  kelamin = betina"); // Perintah untuk menampilkan teks "3.Kucing = tiffanie\n  Warna = Krame\n  Umur = 4 Tahun\n  kelamin = betina" ke layar.
            System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
           
           
            break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
            default: // default merupakan bagian dari perintah pengkondisian switch-case di Java.
            // Aksi untuk pilihan yang tidak valid
            System.out.println(); // Perintah untuk menampilkan baris kosong ke layar.
            System.out.println("Pilihan yang Anda masukkan tidak valid"); // Perintah untuk menampilkan teks "Pilihan yang Anda masukkan tidak valid" ke layar.
            break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
         } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
      } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
       while (pilihan >= 7); // Dengan menggunakan perintah perulangan while, Kondisi ini akan bernilai false jika pilihan yang diinput adalah lebih besar/sama dengan 7.
      Scanner Nomor = new Scanner(System.in); // Baris ini membuat objek baru yaitu variabel Nomor dari kelas scanner.
      int pilih; // ini adalah variabel pilih bertipe integer
      int respon; // ini adalah variabel respon bertipe integer
      int tambah;// ini adalah variabel tambah bertipe integer
      int tukar; // ini adalah variabel tukar bertipe integer
      System.out.print("Jenis Kucing : "); // Perintah untuk menampilkan teks "Jenis Kucing : " ke layar.
      String data = Nomor.nextLine(); // Perintah untuk memecah sebuah String yang disimpan dalam variabel Nomor dan menyimpan hasil pemecahan tersebut dalam sebuah variabel bernama data.
      System.out.print("Pilih Keterangan Kucing :"); // Perintah untuk menampilkan teks "Pilih Keterangan Kucing :" ke layar.
      
      
       { // ini merupakan tanda kurung kurawal yang menendakan awal dari suatu kelas atau method.
         
         pilih = Nomor.nextInt(); // Perintah untuk membaca nomor bilangan bulat dan menyimpannya dalam variabel bernama pilih.
         
          switch (pilih) { // Switch statements untuk mengeksekusi beberapa kondisi berdasarkan nilai kondisi yang diinput.
              case 1: // Case 1 merupakan kondisi pertama dan bagian dari perintah Switch-case.
              System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
              System.out.println("Anda Telah Mengadopsi Kucing "+data+" Dengan Keterangan No."+pilihan); // Perintah untuk menampilkan teks "Anda Telah Mengadopsi Kucing " ditambah data lalu teks "Dengan Keterangan No." ditambah data pada pilihan ke layar.     
              System.out.println(""); // Perintah untuk menampilkan baris kosong ke layar.   
              System.out.println("Apakah Anda ingin menukar pilihan kucing anda? \nJika ingin anda bisa memilih nomor \n 1.Tukar \n 2.Tidak "); // Perintah untuk menampilkan teks "Apakah Anda ingin menukar pilihan kucing anda? \nJika ingin anda bisa memilih nomor \n 1.Tukar \n 2.Tidak" ke layar.
              System.out.print("Respon : "); // Perintah untuk menampilkan teks "Respon : " ke layar. 
              respon = Nomor.nextInt(); // Perintah untuk membaca nomor bilangan bulat dan menyimpannya dalam variabel bernama respon.

              if(respon == 1){ // Dengan menggunakan perintah if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 1.
                 System.out.println("anda Memilih menu tukar "); // Perintah untuk menampilkan teks "anda Memilih menu tukar " ke layar.
                 System.out.println("anda akan kembali ke Menu Jenis-Jenis Kucing"); // Perintah untuk menampilkan teks "anda akan kembali ke Menu Jenis-Jenis Kucing" ke layar.
                 Kucing l =new Kucing(); // Baris ini mendeklarasi dan inisialisasi objek baru bernama l dari kelas "Kucing"
                 l.jenis(); //Baris ini memanggil method "jenis()" pada objek "l"
            }  // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
              
              else if (respon==2){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 2.
                  System.out.println("TerimaKasih Sudah Mau Merawat dan Mencintai kucing"); // Perintah untuk menampilkan teks "TerimaKasih Sudah Mau Merawat dan Mencintai kucing" ke layar.
                 
                
              } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
              
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
              case 2: // Case 2 merupakan kondisi kedua dan bagian dari perintah Switch-case.
              System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
              System.out.println("Anda Telah Mengadopsi Kucing "+data+" Dengan Keterangan No."+pilihan); // Perintah untuk menampilkan teks "Anda Telah Mengadopsi Kucing " ditambah data lalu teks "Dengan Keterangan No." ditambah data pada pilihan ke layar.    
              System.out.println(""); // Perintah untuk menampilkan baris kosong ke layar.   
              System.out.println("Apakah Anda ingin menukar pilihan kucing anda? \nJika ingin anda bisa memilih nomor \n 1.Tukar \n 2.Tidak "); // Perintah untuk menampilkan teks "pakah Anda ingin menukar pilihan kucing anda? \nJika ingin anda bisa memilih nomor \n 1.Tukar \n 2.Tidak " ke layar.
              System.out.print("Respon : "); // Perintah untuk menampilkan teks "Respon : " ke layar.  
              respon = Nomor.nextInt(); // Baris kode tersebut merupakan perintah untuk membaca input nomor dari pengguna dan menyimpan nilainya ke dalam variabel bernama respon.

              if(respon == 1){ // Dengan menggunakan perintah if, Kondisi ini akan bernilai true jika respon yang diinput adalah 1.
                 System.out.println("anda Memilih menu tukar "); // Perintah untuk menampilkan teks "anda Memilih menu tukar " ke layar.
                 System.out.println("anda akan kembali ke Menu Jenis-Jenis Kucing"); // Perintah untuk menampilkan teks "anda akan kembali ke Menu Jenis-Jenis Kucing" ke layar.
                 Kucing l =new Kucing(); // Baris ini mendeklarasi dan inisialisasi objek baru bernama l dari kelas "Kucing"
                 l.jenis();//Baris ini memanggil method "jenis()" pada objek "l"
            }  // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
              
              else if (respon==2){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika pilihan yang diinput adalah 2.
                  System.out.println("TerimaKasih Sudah Mau Merawat dan Mencintai kucing"); // Perintah untuk menampilkan teks "TerimaKasih Sudah Mau Merawat dan Mencintai kucing" ke layar.
           
                  
              } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
               case 3: // Case 3 merupakan kondisi ketiga dan bagian dari perintah Switch-case.
               System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
              System.out.println("Anda Telah Mengadopsi Kucing "+data+" Dengan Keterangan No."+pilihan); // Perintah untuk menampilkan teks "Anda Telah Mengadopsi Kucing " ditambah data lalu teks "Dengan Keterangan No." ditambah data pada pilihan ke layar.   
              System.out.println("");  // Perintah untuk menampilkan teks baris kosong ke layar.  
              System.out.println("Apakah Anda ingin menukar pilihan kucing anda? \nJika ingin anda bisa memilih nomor \n 1.Tukar \n 2.Tidak "); // Perintah untuk menampilkan teks "Apakah Anda ingin menukar pilihan kucing anda? \nJika ingin anda bisa memilih nomor \n 1.Tukar \n 2.Tidak" ke layar.
              System.out.print("Respon : ");  // Perintah untuk menampilkan teks "Respon : " ke layar.
              respon = Nomor.nextInt(); // Baris kode tersebut merupakan perintah untuk membaca input nomor dari pengguna dan menyimpan nilainya ke dalam variabel bernama respon.

              if(respon == 1){ // Dengan menggunakan perintah if, Kondisi ini akan bernilai true jika respon yang diinput adalah 1.
                 System.out.println("anda Memilih menu tukar "); // Perintah untuk menampilkan teks "anda Memilih menu tukar " ke layar.
                 System.out.println("anda akan kembali ke Menu Jenis-Jenis Kucing"); // Perintah untuk menampilkan teks "anda akan kembali ke Menu Jenis-Jenis Kucing" ke layar.
                 Kucing l =new Kucing(); // Baris ini mendeklarasi dan inisialisasi objek baru bernama l dari kelas "Kucing"
                 l.jenis(); //Baris ini memanggil method "jenis()" pada objek "l"
            }  // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
              
              else if (respon==2){ // Dengan menggunakan perintah else if, Kondisi ini akan bernilai true jika respon yang diinput adalah 2.
                  System.out.println("TerimaKasih Sudah Mau Merawat dan Mencintai kucing"); // Perintah untuk menampilkan teks "TerimaKasih Sudah Mau Merawat dan Mencintai kucing" ke layar.
                  System.out.println("========================================"); // Perintah untuk menampilkan teks pembatas berupa "=" ke layar.
                  menu(); // Perintah untuk menjalankan method bernama menu() yang terdapat dalam kelas yang sama.
                  
             
                  
              } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
              break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
   
      default: // default merupakan bagian dari perintah pengkondisian switch-case di Java.
        System.out.println("Pilihan yang Anda masukkan tidak valid"); // Perintah untuk menampilkan teks "Pilihan yang Anda masukkan tidak valid" ke layar.
        break; // Break digunakan untuk menghentikan eksekusi perintah pengkondisian atau perulangan yang sedang berlangsung.
      } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
   } while (pilihan >= 4);  // Dengan menggunakan perintah perulangan while, Kondisi ini akan bernilai false jika pilihan yang diinput adalah lebih besar/sama dengan 4.
   }  // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
} // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

   
   

   
 
     

      
   
    






