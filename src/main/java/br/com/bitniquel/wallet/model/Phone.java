package br.com.bitniquel.wallet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Phone {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="phone_generator")
	@SequenceGenerator(name="phone_generator", sequenceName="phone_seq", allocationSize=1)
    private long id;
    private int ddi;
    private int ddd;
    private int number;
    
    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setDdi(int ddi) {
        this.ddi = ddi;
    }
    
    public int getDdi() {
        return ddi;
    }
    
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    
    public int getDdd() {
        return ddd;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
}
