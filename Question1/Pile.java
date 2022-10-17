import java.util.ArrayList;

public class Pile {

    private ArrayList<String> pile;

    public Pile() {
        this.pile= new ArrayList<>();
    }

    public boolean estVide(){
        return this.pile.isEmpty();
    }

    public String sommet(){
        return this.pile.get(taille()-1);
    }

    public void empiler(String s){
        this.pile.add(s);
    }

    public String depiler(){
        String res=sommet();
        this.pile.remove(sommet());
        return res;
    }

    public int taille(){
        return this.pile.size();
    }


}
