/**
 *
 * @author axelulises
 */
public class PrioridadBicola extends Prioridad{
    //Constructor
    public PrioridadBicola(int t){
        super (t);
    }
    /*
        2 métodos para INSERTAR
            a) Clásico donde insertar por FIN (ya existe en cola simple)
            b) Alternativo donde insertar por INI (se hará aquí)
    
        2 métodos para eliminar
            a) Clásico donde eliminar por INI (ya existe en cola simple)
            b) Alternativo donde elimina por FIN (se hará aquí)
    */
    public boolean insertarPorIniBicola(char dato, int prioridad){
        //1. Verifica si llena
        //2. Verifica si está vacía
        //3. Insertar normal
        if(estaColaLlenaIni()) return false;
        if(estaColaVacia()) ini = fin = 0;
        else ini--;
        vector[ini] = new TDAPrioridad(prioridad, dato);
        Priorizar();
        return true;
    }
    
    public boolean eliminarPorFinBicola(){
        //1. Si está vacía
        //2. Si hay 1 elemento
        //3. Eliminar normal
        if(estaColaVacia()) return false;
        if(hayUnSoloDato()) ini = fin = -1;
        else fin--;
        return true;
    }
    
    protected boolean estaColaLlenaIni(){
        return ini == 0;
    } 
    
    private void Priorizar() {
        if (ini == fin) {
            return;
        }
        //Variables temporales y auxiliar
        int Temporal1 = ini, Temporal2 = ini + 1;
        TDAPrioridad auxiliar = new TDAPrioridad(0, 'o');
        
        while (Temporal1 != fin){
            if (vector[Temporal1].getPrioridad()
                    <= vector[Temporal2].getPrioridad()) {
                auxiliar.setObjeto(vector[Temporal2]);
                vector[Temporal2].setObjeto(vector[Temporal1]);
                vector[Temporal1].setObjeto(auxiliar);
                //1 Será igual a 2 CON INCREMENTO
                Temporal1 = Temporal2++;
            }else{
                break;
            }
        }
    }
}
