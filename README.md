### RESTful CRUD application example on Spring Boot

There is a Client entity with saving data to runtime HashMap<Integer, Client>

1. void create(Client client) - POST method, /clients with Client instance in JSON in request body.
2. List<Client> readAll() - GET method, /clients
3. Client read(int id) - GET method, /clients/{id}
4. boolean update(Client client, int id), PUT-method, /clients/{id} with Client instance in request body.
5. boolean delete(int id) - DELETE method, /clients/{id}

### RUN and Testing

1. Download Postman (https://www.postman.com/downloads/)
1. Open Postman
1. Creating a new "Request" (New -> Request)
1. Set name for request and "Create Collection"(e.g.: clients)
1. Send POST request:
    * Select the request type -> "POST"
    * Set the URI -> `http://localhost:8080/clients`
    * Open the "Body" tab
    * Selecting the body type -> "raw"
    * Selecting the "JSON" format
    * Writing the request body:
    >{
         	"name":"Morozov Vadim",
         	"email":"morozovvadim91@gmail.com",
         	"phone":"+37369339092"
         }
    * Run `RestExampleApplication`
    * Sending a request -> "Send"
    * Check the response code, if `200+` on the page(`http://localhost:8080/clients`) you will see your data from the body.
1. Creating multiple clients
1. Change the request type to "GET" and send it to the server
1. Checking status with your Body

![Postman example](https://ibb.co/MPFYJ3C)