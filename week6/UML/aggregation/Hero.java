public class Hero {
    private String nama;
    private Weapon weapon;


/**Construktor */
    public Hero(String nama){
        this.nama = nama;
    }
    /**Procedure */
    public void takeWeapon (Weapon weapon){
        this.weapon = weapon;
    }
    public void useWeapon(){
        System.out.println(this.nama); 
        weapon.giveDamage();
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    /**Function */
    public String getNama(){
        return this.nama;
    }
    public Weapon getWeapon(){
        return this.weapon;
    }
}
