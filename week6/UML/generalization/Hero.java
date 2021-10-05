public class Hero {
    private String nama;
    private String kostum;
    public Hero (String nama, String kostum){
        this.nama = nama;
        this.kostum = kostum;
    }

    public void savePeople(){
        System.out.println(this.nama + "Menyelamatkan orang" + this.kostum);
    }

    public void fight() {
        System.out.println(this.nama + "berkelahi dengan menggunakan kostum " + this.kostum );
    }
}
