public class MahasiswaTest {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Arya", "12345");


        
        System.out.println(m1.getUsername());
        m1.setUsername("Bima");
        System.out.println(m1.getPass());
        m1.setPass("0906023");
        m1.showMahasiswa();
    }
}
