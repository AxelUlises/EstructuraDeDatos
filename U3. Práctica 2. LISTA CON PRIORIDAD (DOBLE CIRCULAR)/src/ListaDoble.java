/**
 *
 * @author axelulises
 */
public class ListaDoble{
    
    protected NodoDobleP ini, fin;
    
    public ListaDoble(){
        ini = fin = null;
    }
    
    public boolean insertar(char dato, int priori){
        if(ini == null){
            ini = fin = new NodoDobleP(dato, priori);
            return true;
        }
        if(ini == fin){
            fin = new NodoDobleP(dato, priori);
            ini.setSig(fin);
            fin.setAnt(ini);
            return true;
        }
        fin.setSig(new NodoDobleP(dato, priori));
        fin.getSig().setAnt(fin);
        fin = fin.getSig();
        return true;
    }
    
    public boolean eliminar(){
        if(fin == null){
            return false;
        }
        if(ini == fin){
            ini = fin = null;
            return true;
        }
        ini = ini.getSig();
        ini.getAnt().setSig(null);
        ini.setAnt(fin);
        return true;
    }
    
    @Override
    public String toString(){
        return mostrar(fin);
    }
    
    private String mostrar(NodoDobleP nodo) {
        if(nodo == ini){
            return nodo.getSig().toString() + "\n";
        }
        return mostrar(nodo.getAnt()) + String.format("%s\n", 
                nodo.getAnt(), nodo, nodo.getSig());
    }
    
}