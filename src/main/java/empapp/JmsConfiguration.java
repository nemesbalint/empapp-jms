package empapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import empapp.dto.EmployeeHasBeenCreatedMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import java.util.Map;


@Configuration(proxyBeanMethods = false)
public class JmsConfiguration {

    @Bean
    public MessageConverter messageConverter(ObjectMapper objectMapper){
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTypeIdPropertyName("_typeId");
        //converter.setTypeIdMappings(Map.of("EmployeeHasCreatedMessage", EmployeeHasBeenCreatedMessage.class));
        return converter;
    }

}
