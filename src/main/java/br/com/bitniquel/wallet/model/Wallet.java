package br.com.bitniquel.wallet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Wallet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="address_generator")
	@SequenceGenerator(name="address_generator", sequenceName="address_seq", allocationSize=1)
    private long id;
    private String bitcoinAddress;
    
    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setBitcoinAddress(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }
    
    public String getBitcoinAddress() {
        return bitcoinAddress;
    }
    
}
