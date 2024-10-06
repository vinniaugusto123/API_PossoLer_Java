package br.com.possoler.api.api_posso_ler.api.cdn.config;

import br.com.possoler.api.api_posso_ler.api.utils.PathConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CDNConfigs {

    @Bean
    public String setCDNPath() {
        return System.getProperty("user.dir") + "\\src\\main\\resources\\static\\CDN\\";
    }

    @Bean
    public Map<String, String> createCDNFilesMap() {
        Map<String, String> files = new HashMap<>();
        files.put("blockCorePaywall", "[FF]blockCorePaywall.js");
        files.put("snackjs", "snackbar.js");
        files.put("snackcss", "snackbar.css");
        files.put("glidejs", "glide.min.js");
        files.put("glidecorecss", "glide.core.min.css");
        files.put("glidethemecss", "glide.theme.min.css");
        return files;
    }
}
