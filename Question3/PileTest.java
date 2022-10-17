import java.io.IOException;

public class PileTest {
    public static void main(String args[]) throws IOException {

        Pile pileTest = new Pile();

        System.out.println("----Test Empiler----");

        if(pileTest.taille()==0){
            System.out.println("Depart à 0 OK");
        }
        pileTest.empiler("Numero0");
        pileTest.empiler("Numero1");
        pileTest.empiler("Numero2");
        pileTest.empiler("Numero3");

        if(pileTest.taille()==4){
            System.out.println("Fonction empiler() OK");
        }

        System.out.println("----Test Sommet----");

        System.out.println(pileTest.sommet());

        if(pileTest.sommet()=="Numero3"){
            System.out.println("Fonction sommet() OK");
        }

        System.out.println("----Test Depiler----");

        pileTest.depiler();

        if(pileTest.sommet()=="Numero2"){
            System.out.println("Fonction depiler() OK");
        }

        System.out.println("----Test Taille----");

        if(pileTest.taille()==3){
            System.out.println("Fonction taille() OK");
        }


        System.out.println("----Test EstVide----");

        if(!pileTest.estVide()){
            System.out.println("Fonction estVide() false OK");
        }

        pileTest.depiler();
        pileTest.depiler();
        pileTest.depiler();


        if(pileTest.estVide()){
            System.out.println("Fonction estVide() true OK");
        }

    }
}
