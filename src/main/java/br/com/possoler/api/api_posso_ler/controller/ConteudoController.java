package br.com.possoler.api.api_posso_ler.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.possoler.api.api_posso_ler.dto.ConteudoDTO;
import br.com.possoler.api.api_posso_ler.entity.Conteudo;
import br.com.possoler.api.api_posso_ler.exceptions.ServerErrorException;
import br.com.possoler.api.api_posso_ler.service.ConteudoService;

@RestController
@RequestMapping("/API")
public class ConteudoController {

    @Autowired
    ConteudoService conteudoService;
    
    @GetMapping("/getConteudos")
    private ResponseEntity<ConteudoDTO> getConteudos()
    {
        Conteudo conteudo = conteudoService.getConteudoEntity();
        return ResponseEntity.ok().body(ConteudoDTO.parseToDTO(conteudo));
    }

    
    @GetMapping("/incrementViewsConteudos")
    private ResponseEntity<Map<String, String>> incrementConteudos()
    {
        Map<String, String> response = new HashMap<>();
        Boolean status = conteudoService.incrementConteudo();
        if(status){
            response.put("status", "sucesso");
            return ResponseEntity.ok().body(response);
        }
        response.put("status", "falha");
        return ResponseEntity.internalServerError().body(response);
    }
}
