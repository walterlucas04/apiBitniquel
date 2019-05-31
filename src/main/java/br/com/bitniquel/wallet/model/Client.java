package br.com.bitniquel.wallet.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="client_generator")
	@SequenceGenerator(name="client_generator", sequenceName="client_seq", allocationSize=1)
    private long id;
    private String fullName;
    private String nickName;
    private Date birth;
    private String email;
    private String password;
    private int document;
    
    @OneToOne
    @JoinColumn
    private Phone phone;
    
    @OneToOne
    @JoinColumn
    private Address address;
    
    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
    public Date getBirth() {
        return birth;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setDocument(int document) {
        this.document = document;
    }
    
    public int getDocument() {
        return document;
    }
    
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    
    public Phone getPhone() {
        return phone;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Address getAddress() {
        return address;
    }
    
}
