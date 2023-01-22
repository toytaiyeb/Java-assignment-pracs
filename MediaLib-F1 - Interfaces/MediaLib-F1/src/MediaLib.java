import java.util.ArrayList;

public class MediaLib {

    ArrayList<Media> medialist;


    public MediaLib() {
        medialist = new ArrayList<Media>();

    }

    public void addMedia( Media m){

        medialist.add(m);
    }


    public void viewAll(){
        for(Media m : medialist){
            System.out.println(m);
        }

    }

    public void playMedia(int index){

        medialist.get(index).play();
    }
}
