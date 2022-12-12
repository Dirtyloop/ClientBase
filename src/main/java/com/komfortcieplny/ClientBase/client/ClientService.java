package com.komfortcieplny.ClientBase.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public Client findClient(Long id) {
        return clientRepository
                .findById(id).orElseThrow(() ->
                        new ClientNotFoundException(String.format("Client with id: %s was not found", id)));
    }
}
