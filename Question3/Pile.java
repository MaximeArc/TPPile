import java.util.ArrayList;

public class Pile<String> implements IPile<String>{

    private ArrayList<String> pile;

    public Pile() {
        this.pile=new ArrayList<>();
    }

    @Override
    public String depiler() {
        String res=sommet();
        this.pile.remove(sommet());
        return res;
    }

    @Override
    public void empiler(String s) {
        this.pile.add(s);
    }

    @Override
    public boolean estVide() {
        return this.pile.isEmpty();
    }

    @Override
    public String sommet() {
        return this.pile.get(taille()-1);
    }

    @Override
    public int taille() {
        return this.pile.size();
    }
}
