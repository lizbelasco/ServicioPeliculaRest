/**
 * 
 */
package com.soa.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soa.dto.Cliente;
import com.soa.dto.Llamada;
import com.soa.dto.Reporte;
import com.soa.dto.Request;
import com.soa.dto.Response;
import com.soa.dto.Servicio;

/**
 * 
 */
@RestController
public class LlamadasRest {
    
//    @GetMapping("/saludar/{nombre}/{apellido}") //URL donde lo va a publicar, es el mas simple
    @RequestMapping(method = RequestMethod.POST, path = "/llamada") //Mas generico se puede usar para cualquiera
    public ResponseEntity<Response> llamada(@RequestBody Request request) {
        Response response = new Response();
        Reporte reporte = new Reporte();
        Llamada llamada = new Llamada();
        Servicio servicio = new Servicio();
        Cliente cliente = new Cliente();
        List<Servicio> servicios = new ArrayList<>();
        Map<String, Llamada> llamadas = new HashMap<String, Llamada>();
        
        response.setReporte(reporte);
        
        llamada.setFecha("f1");
        llamada.setNoTelefonico("t1");
        llamadas.put("llamada1", llamada);
        llamadas.put("llamada2", llamada);
        reporte.setLlamadas(llamadas);
        
        servicio.setNombre("name");
        servicio.setTarifa(10.0);
        servicios.add(servicio);
        reporte.setServicios(servicios);
        
        cliente.setNombre("n1");
        cliente.setApellidoPaterno("ln");
        cliente.setApellidoMaterno("mln");
        reporte.setCliente(cliente);
        
        ResponseEntity<Response> re = new ResponseEntity<>(response, HttpStatus.OK);
        return re;
    }
}
