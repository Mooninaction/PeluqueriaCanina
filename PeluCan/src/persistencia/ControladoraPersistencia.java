
package persistencia;

import java.util.List;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
     
    MascotaJpaController mascJPA = new MascotaJpaController();
     
    
    //método para Alta
    public void crearMascota(Mascota masc){
        try
        {
            mascJPA.create(masc);
        } catch (Exception e){
            System.out.println("No se pudo crear la mascota. Se encuentra vacio");
        }
    } 
    
      //método para Eliminar
    public void eliminarMascota(Mascota masc){
        try
        {
            mascJPA.destroy(masc.getNum_cliente());
        } catch (NonexistentEntityException ex)
        {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
     public void eliminarMascota(int num_cliente){
        try
        {
            mascJPA.destroy(num_cliente);
        } catch (NonexistentEntityException ex)
        {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     }
    
     //método para lectura
    
    public List<Mascota> obtenerMascotas(){
        return mascJPA.findMascotaEntities();
    }
    
    //método para Modificacion
    
    public void modificarMascota(Mascota masc){
        try{
            mascJPA.edit(masc);
        } catch (Exception ex){
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    //método para Búsqueda
    
    public Mascota buscarMascota(Mascota masc){
        return mascJPA.findMascota(masc.getNum_cliente());
    }
    public Mascota buscarMascotaNumClient(int num_cliente){
        return mascJPA.findMascota(num_cliente);
    }
}
