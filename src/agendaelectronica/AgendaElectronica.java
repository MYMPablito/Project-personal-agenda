
package agendaelectronica;

import agendaelectronica.gui.Principal;


public class AgendaElectronica {

    
    public static void main(String[] args) {
        
        Principal princ = new Principal(); //Creo la pantalla
        princ.setVisible(true); // La hago visible
        princ.setLocationRelativeTo(null); // Que se posicione en el medio
    }
    
}
