import java.util.ArrayList;

public interface IPile<T> {

    public T depiler();
    public void empiler(T t) ;
    public boolean estVide();
    public T sommet();
    public int taille();
}
