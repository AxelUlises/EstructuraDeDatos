
/**
 *
 * @author axelulises
 */
public class TDAPrioridad {
    private int prioridad;
    private char dato;
    
    public TDAPrioridad(int prioridad, char dato) {
        this.dato = dato;
        this.prioridad = prioridad;
    }
    
    public int getPrioridad() {
        return prioridad;
    }
    
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    
    public void setObjeto(TDAPrioridad obj) {
        this.prioridad = obj.prioridad;
        this.dato = obj.dato;
    }
    
    @Override
    public String toString(){
        return String.format("%c, %d", dato, prioridad);
    }
}
