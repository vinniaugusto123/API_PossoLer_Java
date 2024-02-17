package br.com.possoler.api.api_posso_ler.api.cdn.service;

import br.com.possoler.api.api_posso_ler.api.cdn.constants.CDNEnum;
import br.com.possoler.api.api_posso_ler.api.utils.PathConstants;
import exceptions.NotFoundException;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class CDNFileService {

    @Autowired
    private HttpServletResponse response;
    //private final String CDN_PATH = System.getProperty("user.dir") + PathConstants.FOLDER_POSSOLER_INTEGRATOR + "/CDN/";
    private final String CDN_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\CDN\\";

    public void readCdnFile(String fileParamName) throws IOException, NotFoundException {
        String filename = getFileName(fileParamName);
        File file = new File(CDN_PATH + filename);
        FileInputStream inputStream = new FileInputStream(file);
        IOUtils.copy(inputStream, response.getOutputStream());
        response.flushBuffer();
    }

    private String getFileName(String file) {
        if(file.equalsIgnoreCase(CDNEnum.BLOCK_CORE_PAYWALL.getFileParamName())) {
            return CDNEnum.BLOCK_CORE_PAYWALL.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.SNACKBAR_JS.getFileParamName())) {
            return CDNEnum.SNACKBAR_JS.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.SNACKBAR_CSS.getFileParamName())) {
            return CDNEnum.SNACKBAR_CSS.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.POSSOLER_LOGO.getFileParamName())) {
            return CDNEnum.POSSOLER_LOGO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.AXIOS_LOGO.getFileParamName())) {
            return CDNEnum.AXIOS_LOGO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.MAVEN_LOGO.getFileParamName())) {
            return CDNEnum.MAVEN_LOGO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.LOMBOK_LOGO.getFileParamName())) {
            return CDNEnum.LOMBOK_LOGO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.SPRING_LOGO.getFileParamName())) {
            return CDNEnum.SPRING_LOGO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.RESPONDE_AI_LOGO.getFileParamName())) {
            return CDNEnum.RESPONDE_AI_LOGO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.GLIDE_JS.getFileParamName())) {
            return CDNEnum.GLIDE_JS.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.GLIDE_CORE_CSS.getFileParamName())) {
            return CDNEnum.GLIDE_CORE_CSS.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.GLIDE_THEME_CSS.getFileParamName())) {
            return CDNEnum.GLIDE_THEME_CSS.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_APP_RESPAI.getFileParamName())) {
            return CDNEnum.EXTENSION_APP_RESPAI.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_RESPAI.getFileParamName())) {
            return CDNEnum.EXTENSION_RESPAI.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_VLR_ECON.getFileParamName())) {
            return CDNEnum.EXTENSION_VLR_ECON.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_EXAME.getFileParamName())) {
            return CDNEnum.EXTENSION_EXAME.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_JOTA.getFileParamName())) {
            return CDNEnum.EXTENSION_JOTA.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_NYTIMES.getFileParamName())) {
            return CDNEnum.EXTENSION_NYTIMES.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_ELPAIS.getFileParamName())) {
            return CDNEnum.EXTENSION_ELPAIS.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_GAUCHAZH.getFileParamName())) {
            return CDNEnum.EXTENSION_GAUCHAZH.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_OPOPULAR.getFileParamName())) {
            return CDNEnum.EXTENSION_OPOPULAR.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_DIARIOSM.getFileParamName())) {
            return CDNEnum.EXTENSION_DIARIOSM.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_OTEMPOMG.getFileParamName())) {
            return CDNEnum.EXTENSION_OTEMPOMG.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_JORNALDOCOMERCIO.getFileParamName())) {
            return CDNEnum.EXTENSION_JORNALDOCOMERCIO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_OPOVO.getFileParamName())) {
            return CDNEnum.EXTENSION_OPOVO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_GAZ.getFileParamName())) {
            return CDNEnum.EXTENSION_GAZ.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_POSSOLER.getFileParamName())) {
            return CDNEnum.EXTENSION_POSSOLER.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_ATT_VERSAO.getFileParamName())) {
            return CDNEnum.EXTENSION_ATT_VERSAO.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_CHECK_MESSAGES.getFileParamName())) {
            return CDNEnum.EXTENSION_CHECK_MESSAGES.getFilename();
        }
        if(file.equalsIgnoreCase(CDNEnum.EXTENSION_COUNT_CONTENT.getFileParamName())) {
            return CDNEnum.EXTENSION_COUNT_CONTENT.getFilename();
        }
        throw new NotFoundException("Arquivo CDN não encontrado");
    }
}