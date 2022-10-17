import java.util.ArrayList;

public class Pile1 {

    private ArrayList<Object> pile;

    public Pile1() {
        this.pile= new ArrayList<>();
    }

    public boolean estVide(){
        return this.pile.isEmpty();
    }

    public Object sommet(){
        return this.pile.get(taille()-1);
    }

    public void empiler(Object o){
        this.pile.add(o);
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
