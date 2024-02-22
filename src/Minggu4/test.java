package Minggu4;
public class test {
  public test(String name){
      System.out.printf("Hallo %s selamat datang!\n",name);
  }
  // Static function
  static void cetakPesan() {
    System.out.println("Hello, world!");
  }
  
  // Non-static function
  void cetakNama(String nama) {
    System.out.println("Nama: " + nama);
  }
  
  public static void main(String[] args) {
    // Memanggil static function
    test.cetakPesan();
    
    // Membuat objek
    test contoh = new test("ok");
    test contoh2 = new test("");
    
    // Memanggil non-static function
    contoh.cetakNama("Bard");
  }
}