/**
 *
 * @author axelulises
 */
public class NodoDobleP {
    
    protected NodoDobleP ant, sig;
    protected char dato;
    protected int priori;
    
    public NodoDobleP(char dato, int priori){
        this.ant = null;
        this.sig = null;
        this.dato = dato;
        this.priori = priori;
    }

    public NodoDobleP getAnt() {
        return ant;
    }

    public void setAnt(NodoDobleP ant) {
        this.ant = ant;
    }

    public NodoDobleP getSig() {
        return sig;
    }

    public void setSig(NodoDobleP sig) {
        this.sig = sig;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getPriori() {
        return priori;
    }

    public void setPriori(int priori) {
        this.priori = priori;
    }
    
    @Override
    public String toString() {
        return "[Dato: " + dato + ", Prioridad: " + priori + "]";
    }
}
