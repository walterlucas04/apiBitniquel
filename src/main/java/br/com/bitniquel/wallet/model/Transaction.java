package br.com.bitniquel.wallet.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="transaction_generator")
	@SequenceGenerator(name="transaction_generator", sequenceName="transaction_seq", allocationSize=1)
    private long id;
    
    @ManyToOne
	@JoinColumn(name = "id_wallet", referencedColumnName="id")
    private Wallet wallet;
    private String bitcoinAddressSource;
    private String bitcoinAddressDestination;
    private Date dateTime;
    private String description;
    
    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    
    public Wallet getWallet() {
        return wallet;
    }
    
    public void setBitcoinAddressSource(String bitcoinAddressSource) {
        this.bitcoinAddressSource = bitcoinAddressSource;
    }
    
    public String getBitcoinAddressSource() {
        return bitcoinAddressSource;
    }
    
    public void setBitcoinAddressDestination(String bitcoinAddressDestination) {
        this.bitcoinAddressDestination = bitcoinAddressDestination;
    }
    
    public String getBitcoinAddressDestination() {
        return bitcoinAddressDestination;
    }
    
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
    public Date getDateTime() {
        return dateTime;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
}
