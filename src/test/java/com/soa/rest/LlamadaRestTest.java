/**
 * 
 */
package com.soa.rest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.soa.dto.Request;
import com.soa.dto.RequestAbc;
import com.soa.dto.Response;

/**
 * 
 */
class LlamadaRestTest {

    @Test
    void test() {
        String url = "http://localhost:8080/llamada";
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("noControl", "12345");
        headers.add("Content-Type", "application/json");
        
        Request request = new Request();
        RequestAbc requestAbc = new RequestAbc();
        requestAbc.setNoTelefonico("1234");
        requestAbc.setPassword("pwd");
        request.setRequestAbc(requestAbc);
        
        HttpEntity<Request> req = new HttpEntity<>(request, headers);
        ResponseEntity<Response> re = restTemplate.exchange(url,HttpMethod.POST, req, Response.class);
        Gson gson = new Gson();
        System.out.println(gson.toJson(re.getBody()));
        assertEquals(200, re.getStatusCode().value());
    }

}
