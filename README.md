# Patient Management System

### Tech Stack
Spring Boot, Spring Data JPA, Postgres, Maven, Kafka, Docker, H2(for testing db locally)

### Architectures

#### Spring Boot Architecture
![Spring-Boot-Architecture](https://github.com/naveen-v-v/patient-management-system/blob/main/architectures/springboot-architecture.png)

#### REST & gRPC API Architecture
- REST is used for communication between client and server. Exposed to client applications.
- gRPC is used for communication between internal microservices. As gRPC is faster than REST, and it uses HTTP/2, it is more efficient for inter-service communication.

![gRPC-Architecture](https://github.com/naveen-v-v/patient-management-system/blob/main/architectures/gRPC%20architecture.png)

### Docker
- Docker compose file is present in the root folder.
- Useful commands are as follows:
```
  # To build and run the application
  docker-compose up --build
  
  # To stop the application
  docker-compose down
  
  # To run specific service defined in docker-compose file
  docker-compose up patient-service-db
  
  # To run the application in detached mode
  docker-compose up -d --build
  
  # To view the logs
  docker-compose logs -f
  ```
### Sample data for DB
"data.sql" file is present in src/main/resources folder. It will be executed automatically when the application is started.

### Documentation
- Swagger - springdoc-openapi is used for documentation.
- To check out the documentation, run the app --> goto http://localhost:4000/v3/api-docs

### Environment Variables
For environment variables, setup ".env" file in the root folder similar to the ".env.example" file present in the root folder.