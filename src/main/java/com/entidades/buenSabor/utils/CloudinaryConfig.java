package com.entidades.buenSabor.utils;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Value("dzgqtliv8") // Inyección de valor desde el archivo de application.properties
    private String cloudName;

    @Value("851621163565336")
    private String apiKey;

    @Value("HOs4vlwlUSemPb2rZ7aQCNyPmLs")
    private String apiSecret;

    @Bean
    public Cloudinary cloudinary() {
        // Configuración y creación del objeto Cloudinary con los valores inyectados
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key", apiKey,
                "api_secret", apiSecret));
    }
}
