public class Main {
    public static void main(String[] args) {
        
        Hero h1 = new Hero("IronMan", "Jarvis");
        h1.fight();
        h1.savePeople();

        Spiderman sp1 = new Spiderman("Spider Original ", " Default ", 500);
        sp1.fight();
        sp1.savePeople();
        sp1.webShot(10);
        System.out.println(sp1.showSisaJaring());
        sp1.recoverJaring(5);
        System.out.println(sp1.showSisaJaring());

        Spiderman sp2 = new Spiderman("Spider KW ", " Item ", 50);
        sp2.fight();
        sp2.savePeople();
        sp2.webShot(10);
        System.out.println(sp2.showSisaJaring());
        sp2.recoverJaring(5);
        System.out.println(sp2.showSisaJaring());
        
    }
}
