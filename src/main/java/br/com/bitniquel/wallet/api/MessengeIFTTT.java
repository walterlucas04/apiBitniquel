package br.com.bitniquel.wallet.api;

import java.io.IOException;
import org.springframework.stereotype.Service;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import br.com.bitniquel.wallet.model.Phone;

@Service
public class MessengeIFTTT {
    
    OkHttpClient client = new OkHttpClient();
    Request request;
    
    public boolean sendSms(Phone phone, String mensagem) throws IOException{
        
        boolean result = false;
        
        String json = "{ \"value1\" : \""+ phone.getDdd() + phone.getNumber() +"\", \"value2\" : \""+ mensagem +"\" }";
        
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        
        Request request = new Request.Builder()
                                .url("https://maker.ifttt.com/trigger/testenotificacao/with/key/brwJjMRTkMYqkKU7BYSwTW")
                                .post(requestBody)
                                .build();
                                
        Response response = client.newCall(request).execute();
        
        String responseString = response.body().string();
        
        if(responseString.startsWith("Congratulations!")){
            result = true;
        }
        
        return result;
        
    }
    
}
