public class Mahasiswa {
    private String username;
    private String pass;

    public Mahasiswa (String username, String pass){
        this.username = username;
        this.pass = pass;

    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public String getPass(){
        return this.pass;
    }

    public void showMahasiswa(){
        System.out.println("Ini adalah username yang telah diganti= " + this.username );
        System.out.println("Ini adalah password yang telah diganti= " + this.pass);
    }
}
