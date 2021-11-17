
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mascota implements Serializable {
    @Id
    private int num_cliente;

    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private Boolean alergico;
    private Boolean atencion_especial;
    private String observaciones;
    private String nombre_duenio;
    private String celular_duenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre_perro, String raza, String color, Boolean alergico, Boolean atencion_especial, String observaciones, String nombre_duenio, String celular_duenio) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAlergico() {
        return alergico;
    }

    public void setAlergico(Boolean alergico) {
        this.alergico = alergico;
    }

    public Boolean getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(Boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }
    
    
    
}
