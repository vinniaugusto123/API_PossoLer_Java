package br.com.possoler.api.api_posso_ler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.possoler.api.api_posso_ler.entity.Conteudo;
import br.com.possoler.api.api_posso_ler.exceptions.ServerErrorException;
import br.com.possoler.api.api_posso_ler.repository.ConteudoRepository;

@Service
public class ConteudoService {
    
    @Autowired
    ConteudoRepository conteudoRepository;

    /**
     * Pega e retorna a entidade Conteudo
     * @author thomazf
     * @return Conteudo
     */
    public Conteudo getConteudoEntity()
    {
        return conteudoRepository
            .findById(0)
            .orElseThrow(() -> new ServerErrorException("Falha ao obter conteudo"));
    }


    /**
     * Incrementa conteúdos visualizados no BD
     * @author thomazf
     * @return Boolean
     */
    public Boolean incrementConteudo()
    {
        try{
            Conteudo conteudo = this.getConteudoEntity();
            conteudo.setQtdConteudo(conteudo.getQtdConteudo() + (long) 1);
            conteudoRepository.save(conteudo);
            return true;
        }catch(RuntimeException e){
            return false;
        }
    }
}
