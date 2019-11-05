
package paquete;
import java.util.ArrayList;

public class NewMain {


    public static void main(String[] args) {
        Lista miLista=new Lista();
        
        miLista.agregarnodoalfinaldelalista(4);
        miLista.agregarnodoalfinaldelalista(6);
        miLista.agregarnodoalfinaldelalista(7);
        miLista.agregarnodoalfinaldelalista(8);
//        miLista.agregaralinicio(4);
//        miLista.agregaralinicio(5);
//        miLista.agregaralinicio(3);
//        miLista.agregaralinicio(7);
//        miLista.agregaralinicio(6);
        miLista.mostraslalista();
        miLista.eliminar(8);        
        miLista.eliminar(4);
        miLista.eliminar(7);
        miLista.mostraslalista();
    }
    
}

