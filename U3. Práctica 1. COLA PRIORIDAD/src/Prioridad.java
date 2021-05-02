/**
 *
 * @author axelulises
 */
public class Prioridad {
    protected int ini;
    protected int fin;
    protected TDAPrioridad[] vector;
    //Constructor
    public Prioridad(int tamano){
        vector = new TDAPrioridad[tamano];
        ini = -1;
        fin = -1;
    }
                           //Parámetros
    public boolean insertar(char dato, int prioridad){
        if(estaColaLlena()){ 
            return false;
        }   
        fin++; 
        //Colocar caracter según la prioridad en la cola
        vector[fin] = new TDAPrioridad(prioridad, dato); 
        if(ini == -1){
            ini = 0;
        }
        Priorizar();
        return true;
    }
    
    public boolean eliminar(){
        if(estaColaVacia()){
            return false;
        }     
        if(ini == fin){
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }
    
    //Coloca el dato en la posición según la 
    //PRIORIDAD tomada.
    private void Priorizar() {
        if (ini == fin) {
            return;
        }
        //Variables temporales y auxiliar
        int Temporal1 = fin, Temporal2 = fin - 1;
        TDAPrioridad auxiliar = new TDAPrioridad(0, '0');
        
        while (Temporal1 != ini){
            if (vector[Temporal1].getPrioridad() > 
                    vector[Temporal2].getPrioridad()) {
                auxiliar.setObjeto(vector[Temporal1]);
                vector[Temporal1].setObjeto(vector[Temporal2]);
                vector[Temporal2].setObjeto(auxiliar);
                Temporal2--;
                Temporal1--;
            }else{
                break;
            }
        }
    }
    
    public TDAPrioridad getValor(int pos){
        return vector[pos];
    }
    
    protected boolean estaColaLlena(){
        return fin == vector.length-1;
    }
    
    protected boolean estaColaVacia(){
        return ini == -1 && fin == -1;
    }
    
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }
    
    public int getIni(){
        return ini;
    }
    
    public int getFin(){
        return fin;
    }
    
}
