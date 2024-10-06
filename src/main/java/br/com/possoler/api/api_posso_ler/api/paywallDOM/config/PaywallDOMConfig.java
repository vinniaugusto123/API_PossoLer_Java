package br.com.possoler.api.api_posso_ler.api.paywallDOM.config;

import br.com.possoler.api.api_posso_ler.api.utils.PathConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PaywallDOMConfig {

    @Bean
    public String setFilepath() {
        return System.getProperty("user.dir") + "\\src\\main\\resources\\paywallDOM\\configFiles\\";
    }
}
