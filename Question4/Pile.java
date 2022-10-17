import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void writePileContent(String s) throws IOException {
        FileWriter file = new FileWriter(s);

        for (int i = 0; i < taille(); i++) {
            file.write(pile.get(i)+"\n");
        }
        file.close();
        }

    public void readPileContent(String s) throws IOException {
        try {
            Scanner scanner = new Scanner(new File(s));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



