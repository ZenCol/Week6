public class Main {
    public static void main(String[] args) {
        Weapon w1 = new Weapon (30, "Palu");
        Weapon w2 = new Weapon (5, "GEGEP");
        Hero h1 = new Hero ("Thor");
        Hero h2 = new Hero ("Iron Man");
        
        h1.takeWeapon(w2);
        h1.useWeapon();

        h2.takeWeapon(w1);
        h2.useWeapon();
        

    }
}
