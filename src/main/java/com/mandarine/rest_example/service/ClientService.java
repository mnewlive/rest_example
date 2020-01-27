package com.mandarine.rest_example.service;

import com.mandarine.rest_example.model.Client;

import java.util.List;

/**
 * The service will implement CRUD operations on the client.
 */
public interface ClientService {

    /**
     * creates a new client
     * @param client - which we will create
     */
    void create(Client client);

    /**
     * Returns a list of all clients
     * @return client list
     */
    List<Client> readAll();

    /**
     * Returns the client by ID
     * @param id - id of the client
     * @return Client object with the specified ID
     */
    Client read(int id);

    /**
     * Updates the client with the specified ID,
     * @param client - the client for which you want to update the data
     * @param id - id of the client which we need to update
     * @return boolean, true if data was updated, false if data was not updated
     */
    boolean update(Client client, int id);

    /**
     * Deletes a client with the specified id
     * @param id - id of the client that we need to delete
     * @return boolean, true if client was deleted, false if client was not deleted
     */
    boolean delete(int id);
}
