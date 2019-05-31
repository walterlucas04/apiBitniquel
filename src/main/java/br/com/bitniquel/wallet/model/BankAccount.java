package br.com.bitniquel.wallet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.ManyToOne;

import javax.persistence.JoinColumn;

@Entity
public class BankAccount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="bankAccount_generator")
	@SequenceGenerator(name="bankAccount_generator", sequenceName="bankAccount_seq", allocationSize=1)
    private long id;
    
    @ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName="id")
    private Client client;
    
    private int bankNumber;
    private int branchNumber;
    private int accountNumber;
    
    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setClient(Client client){
        this.client = client;
    }
    
    public Client getClient(){
        return client;
    }
    
    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }
    
    public int getBankNumber() {
        return bankNumber;
    }
    
    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }
    
    public int getBranchNumber() {
        return branchNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
}
