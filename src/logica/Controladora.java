
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //métodos para Mascota
    public void altaMascota(Mascota masc){
        controlPersis.crearMascota(masc);
    }
    public void bajaMascota(Mascota masc){
        controlPersis.eliminarMascota(masc);
    }
    public void bajaMascota(int num_cliente){
        controlPersis.eliminarMascota(num_cliente);
    }
    public List<Mascota> obtenerMascotas(){
        return controlPersis.obtenerMascotas();
    }
    public void modificarMascota(Mascota masc){
        controlPersis.modificarMascota(masc);
    }
    public Mascota buscarMascota(Mascota masc){
        return controlPersis.buscarMascota(masc);
    }
    public Mascota buscarMascota(int num_cliente){
        return controlPersis.buscarMascotaNumClient(num_cliente);
    }
    
}
