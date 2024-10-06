package br.com.possoler.api.api_posso_ler.api.cachemock_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SiteDataDTO {

    @JsonProperty(value = "site_name", required = true)
    private String siteName;
}
