/**
 *
 * @author axelulises
 */
public class ListaDobleCircularP extends ListaDobleCircular{
    
    public ListaDobleCircularP(){
        super();
    }
    
    public boolean insertar(char dato, int priori){
        if(!super.insertar(dato, priori)){
            return false;
        }
        if(fin.getPriori() == fin.getAnt().getPriori()){
            return true;
        }
        if (fin.getPriori() > ini.getPriori()) {
            fin = fin.getAnt();
            ini = ini.getAnt();
            return true;
        }
        NodoDobleP auxiliar = fin.getAnt();
        while (fin.getPriori() > auxiliar.getPriori()) {
            auxiliar = auxiliar.getAnt();
        }
        fin.setSig(auxiliar.getSig());
        ini.setAnt(fin.getAnt());
        fin.getAnt().setSig(ini);
        fin.setAnt(auxiliar);
        auxiliar.getSig().setAnt(fin);
        auxiliar.setSig(fin);
        fin = ini.getAnt();
        return true;
    }
}
