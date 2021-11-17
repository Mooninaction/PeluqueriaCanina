
package logica;

import igu.Principal;

public class Main {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Principal principal = new Principal(control);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
    
}
