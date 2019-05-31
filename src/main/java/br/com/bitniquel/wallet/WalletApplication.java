package br.com.bitniquel.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextListener;

@Controller
@SpringBootApplication
public class WalletApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(WalletApplication.class, args);
    }
    
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
    
}
