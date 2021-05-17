/**
 *
 * @author axelulises
 */
public class ListaDobleCircular extends ListaDoble{
    
    public ListaDobleCircular(){
        super();
    }
    
    public boolean insertar (char dato, int priori){
        if(super.insertar(dato, priori)){
            fin.setSig(ini);
            ini.setAnt(fin);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(){
        if(super.eliminar() && fin != null){
            fin.getSig().setAnt(null);
            fin.setSig(ini);
            return true;
        }
        return false;
    }
}
