public class Driver {

    public static void main(String args[]) {

        CD c1 = new CD("Titanic", "Celine Dion", 6, 200);
        CD c2 = new CD("MLTR", "Michael", 8, 400);
        DVD d1 = new DVD("Sholay", "Sippy", 750);
        DVD d2 = new DVD("DDLJ", "KJo", 650);

        MediaLib lib = new MediaLib();
        lib.addMedia(c1);
        lib.addMedia(c2);
        lib.addMedia(d1);
        lib.addMedia(d2);

        lib.viewAll();

        lib.playMedia(1);
        lib.playMedia(3);
    }

}
