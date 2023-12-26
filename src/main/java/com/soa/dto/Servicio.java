/**
 * 
 */
package com.soa.dto;

/**
 * 
 */
public class Servicio {
    
    //Para N numero de servicios
    
    private String nombre;
    private Double tarifa;
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the tarifa
     */
    public Double getTarifa() {
        return tarifa;
    }
    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}
