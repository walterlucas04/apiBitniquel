package br.com.bitniquel.wallet.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.bitniquel.wallet.model.Address;
import br.com.bitniquel.wallet.model.Client;

@RestController
@RequestMapping("/client")
public class ClientController {
    
    @GetMapping("/login")
    public Client clientLogin(){
        
        Client client = new Client();
        client.setFullName("Ivanildo Antonio da Silva Junior");
        client.setNickName("Junior Silva");
        
        Address address = new Address();
        address.setPostalCode(56621170);
        address.setCity("Mossoró");
        address.setState("Rio Grande do Norte");
        address.setCountry("Brasil");
        address.setNumber(205);
        address.setStreet("Lira Tavares");
        
        client.setAddress(address);
        
        return client;
        
    }

}
