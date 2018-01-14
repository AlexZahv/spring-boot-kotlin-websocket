package zahv.alex.ru.websocketangulardemo.cors

import org.springframework.stereotype.Component
import org.springframework.web.filter.CorsFilter


@Component
class CustomCorsFilter(corsContext: CorsContext) : CorsFilter(corsContext.configurationSource())