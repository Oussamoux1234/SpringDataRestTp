package ma.emsi.essalmani.feignclient.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "etudiant-service", url = "http://localhost:8093")
public interface EtudiantClient {
    @GetMapping(value="/etudiants", produces = "application/json")
    Map<String, Object> getAllEtudiants();
}
