import java.util.ArrayList;

public class Pile2 {

    private ArrayList<String> pile;

    public Pile2() {
        this.pile= new ArrayList<>();
    }

    public boolean estVide(){
        return this.pile.isEmpty();
    }

    public Object sommet(){
        return this.pile.get(taille()-1);
    }

    public void empiler(Object o){
        this.pile.add(String.valueOf(o));
    }

    public Object depiler(){
        Object res=sommet();
        this.pile.remove(sommet());
        return res;
    }

    public int taille(){
        return this.pile.size();
    }


}
