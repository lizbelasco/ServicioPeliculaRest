/**
 * 
 */
package com.soa.dto;

import java.util.List;
import java.util.Map;

/**
 * 
 */
public class Reporte {
    private Cliente cliente;
    private List<Servicio> servicios; // para n servicios
    private Map<String, Llamada> llamadas;

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the servicio
     */
    public List<Servicio> getServicios() {
        return servicios;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicios(List<Servicio> servicio) {
        this.servicios = servicio;
    }

    /**
     * @return the llamadas
     */
    public Map<String, Llamada> getLlamadas() {
        return llamadas;
    }

    /**
     * @param llamadas the llamadas to set
     */
    public void setLlamadas(Map<String, Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    /*
     * public static void main(String[] args) { Reporte r = new Reporte();
     * Map<String, Llamada> llamadas = new HashMap<String, Llamada>();
     * 
     * Llamada llamada = new Llamada(); llamada.setFecha("f1"); // Le agregamos
     * datos dentro de cada elemento llamada llamada.setNoTelefonico("t1");
     * llamadas.put("llamada1", llamada); // Agregamos los elementos llamada a
     * llamadas llamadas.put("llamada2", llamada); r.setLlamadas(llamadas);
     * 
     * // Generamos el JSON para que se vea mas claro Gson gson = new Gson();
     * System.out.println(gson.toJson(r));
     * 
     * }
     */
}
