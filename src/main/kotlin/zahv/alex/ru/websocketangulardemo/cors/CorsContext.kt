package zahv.alex.ru.websocketangulardemo.cors

import org.springframework.stereotype.Component
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@Component
class CorsContext {
    fun configurationSource(): UrlBasedCorsConfigurationSource {
        val config = org.springframework.web.cors.CorsConfiguration()
        config.allowCredentials = true
        config.addAllowedOrigin("*")
        config.addAllowedHeader("*")
        config.maxAge = 36000L
        config.allowedMethods = java.util.Arrays.asList("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
        val source = org.springframework.web.cors.UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", config)
        return source
    }
}