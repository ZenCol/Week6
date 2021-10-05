public class Weapon {
    private int damage;
    private String namWep;


 /**construktor */
    public Weapon (int damage, String namWep){
        this.damage = damage;
        this.namWep = namWep;
    }
    public void giveDamage(){
        System.out.println("memberikan damage sebesar " + this.damage + " Menggunakan " + this.namWep);
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public String namaWeapon(String namWep){
        return this.namWep;
    }
    public int getDamage(){
        return this.damage;
    }
}
