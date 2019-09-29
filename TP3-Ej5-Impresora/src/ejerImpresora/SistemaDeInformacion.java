package ejerImpresora;

import java.util.Observable;
import java.util.Observer;

public class SistemaDeInformacion implements Observer {

    @Override
    public void update(Observable arg0, Object arg1) {
            Impresora i = (Impresora) arg0;
            System.out.println(i);
    }

    public void imprimirTodo(Observable arg0, Object arg1){
        Impresora i = (Impresora) arg0;
        for(Documento d:i.getTrabajosEnCola()){
            d.imprimite();
        }
            System.out.println(i);
    }
    
    public void imprimir(Observable arg0, Object arg1, Documento documento){
        Impresora i = (Impresora) arg0;
        documento.imprimite();
    }    
}