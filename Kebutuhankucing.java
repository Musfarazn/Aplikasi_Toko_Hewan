public class Kebutuhankucing { //Kelas dengan nama kebutuhankucing ini bersifat publik.
    private String kebutuhan1; // Baris ini merupakan deklarasi variabel bertipe String bernama kebutuhan1.
    private String kebutuhan2; // Baris ini merupakan deklarasi variabel bertipe String bernama kebutuhan2.
    private String kebutuhan3; // Baris ini merupakan deklarasi variabel bertipe String bernama kebutuhan3.
    

    public Kebutuhankucing(String kebutuhan1, String kebutuhan2, String kebutuhan3){ // Baris ini mendeklarasikan sebuah constructor bernama Kebutuhankucing yang memiliki 3 parameter bertipe String.
        this.kebutuhan1  = kebutuhan1;// perintah untuk mengisi nilai dari variabel kebutuhan1 di dalam kelas dengan nilai yang diterima melalui parameter kebutuhan1.
        this.kebutuhan2 = kebutuhan2; // perintah untuk mengisi nilai dari variabel kebutuhan1 di dalam kelas dengan nilai yang diterima melalui parameter kebutuhan2.
        this.kebutuhan3 = kebutuhan3; // perintah untuk mengisi nilai dari variabel kebutuhan1 di dalam kelas dengan nilai yang diterima melalui parameter kebutuhan1.
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

    public void setkebutuhan1(String kebutuhan1){ // Baris ini merupakan deklarasi sebuah method bernama setkebutuhan1 yang menerima sebuah parameter bertipe String bernama kebutuhan1.
        this.kebutuhan1 = kebutuhan1; // perintah untuk mengisi nilai dari variabel kebutuhan1 di dalam kelas dengan nilai yang diterima melalui parameter kebutuhan1.
        
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
    public void setkebutuhan2(String kebutuhan2){ // Baris ini merupakan deklarasi sebuah method bernama setkebutuhan2 yang menerima sebuah parameter bertipe String bernama kebutuhan2.
        this.kebutuhan2 = kebutuhan2; // perintah untuk mengisi nilai dari variabel kebutuhan1 di dalam kelas dengan nilai yang diterima melalui parameter kebutuhan2.
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
    public void setkebutuhan3 (String kebutuhan3){ // Baris ini merupakan deklarasi sebuah method bernama setkebutuhan3 yang menerima sebuah parameter bertipe String bernama kebutuhan3.
        this.kebutuhan3 = kebutuhan3; // perintah untuk mengisi nilai dari variabel kebutuhan1 di dalam kelas dengan nilai yang diterima melalui parameter kebutuhan3.
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.

    public String getkebutuhan1(){ //Baris ini merupakan deklarasi sebuah method bernama getkebutuhan1 yang tidak menerima parameter apapun.
        return kebutuhan1; // perintah untuk mengembalikan nilai dari variabel kebutuhan1 ke pemanggil method.
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
    public String getkebutuhan2(){ //Baris ini merupakan deklarasi sebuah method bernama getkebutuhan2 yang tidak menerima parameter apapun.
        return kebutuhan2; // perintah untuk mengembalikan nilai dari variabel kebutuhan2 ke pemanggil method.
    } // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
    public String getkebutuhan3(){ //Baris ini merupakan deklarasi sebuah method bernama getkebutuhan3 yang tidak menerima parameter apapun.
        return kebutuhan3; // perintah untuk mengembalikan nilai dari variabel kebutuhan3 ke pemanggil method.
    }  // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.   
} // ini merupakan tanda kurung kurawal yang menendakan akhir dari suatu kelas atau method.
