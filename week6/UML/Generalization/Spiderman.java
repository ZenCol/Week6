public class Spiderman extends Hero{


    private int jaring;
    public Spiderman(String nama, String kostum, int jaring) {
        super(nama, kostum);
        this.jaring = jaring;

    }

    public void webShot(int output){
        //System.out.println("Jaring setelah digunakan"+ this.jaring);
        this.jaring = this.jaring - output;
        //atau juga bisa dengan this.jaring -= jaring;
    }
    public void recoverJaring(int input){
        System.out.println("Jaring ditambahkan");
        this.jaring += input;
    }
    public int showSisaJaring(){
        System.out.println("sisa Jaring setelah digunakan");
        return this.jaring;
        
    }
}
