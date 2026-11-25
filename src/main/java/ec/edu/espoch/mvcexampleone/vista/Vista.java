
package ec.edu.espoch.mvcexampleone.vista;

import ec.edu.espoch.mvcexampleone.controlador.ControladorOperaciones;

/**
 *
 * @author HP
 */
public class Vista {

    ControladorOperaciones controlador = new ControladorOperaciones();
    public String getNumOne(){
      return "5";
}
    
    public String getNumTwo(){
    
      return "6";
}
    public void mostrar (float respuesta){
        System.out.println("La respuesta es "+ respuesta );
    }
    public void mostrarError(){
        
        System.out.println("Error....");
            
    }        
         
    public void enviar(){
        controlador.controlarOperacion();
    }
    }

