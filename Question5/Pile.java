import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Pile implements Serializable {

    private ArrayList<Object> pile;

    public Pile() {
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

    public void writeObj() throws IOException {
        FileOutputStream file = new FileOutputStream("pile.txt");
        ObjectOutputStream output = new ObjectOutputStream(file);
        output.writeObject(this);
        output.close();
    }

    public Pile readObj() throws IOException, ClassNotFoundException {
        FileInputStream fileStream = new FileInputStream("pile.txt");
        ObjectInputStream objStream = new ObjectInputStream(fileStream);
        Pile readPile = (Pile) objStream.readObject();

        objStream.close();
        return readPile;
    }

    @Override
    public String toString() {
        return "Pile = " + pile;
    }
}