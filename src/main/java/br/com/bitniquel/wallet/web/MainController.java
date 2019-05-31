package br.com.bitniquel.wallet.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bitniquel.wallet.model.Phone;
import br.com.bitniquel.wallet.api.MessengeIFTTT;

@Controller
public class MainController {
    
    @Autowired
    MessengeIFTTT messengeIFTTT;
    
    @GetMapping("/")
    public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		
		Phone phone = new Phone();
		phone.setDdd(84);
		phone.setNumber(999120445);
		
		try {
		    if(messengeIFTTT.sendSms(phone, "Teste :)")){
		        System.out.println("Menssagem enviada com sucesso!");
		    } else {
		        System.out.println("A menssagem não foi enviada");
		    }
		} catch (IOException e){
		    System.err.println("ERRO AO ENVIAR O SMS");
		    e.printStackTrace();
		}
		
		return modelAndView;
    }
    
}
