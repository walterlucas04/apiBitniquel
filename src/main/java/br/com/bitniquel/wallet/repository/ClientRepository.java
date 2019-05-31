package br.com.bitniquel.wallet.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.bitniquel.wallet.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
    
}
