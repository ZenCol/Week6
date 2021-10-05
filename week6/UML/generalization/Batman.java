public class Batman extends Hero{
    private int batarang ;
    public Batman(String nama, String kostum, int batarang) {
        super(nama, kostum);
        this.batarang = batarang;

    }
    public void batarangShot(int output){
        //System.out.println("batarang sebelum digunakan "+ this.batarang);
        this.batarang -= output;
    }
    public void recoverBatarang(int batarang){
        //System.out.println("batarang setelah digunakan "+ this.batarang);
        this.batarang += batarang;
    }
    public int showSisaBataram(){
        //System.out.println("Sisa batarang hero batman adalah"+ this.batarang);
        return this.batarang;
    }
}
