# Patient Management System

### Tech Stack
Spring Boot, Spring Data JPA, Postgres, Maven, Kafka, Docker, H2(for testing db locally)

### Spring Boot Architecture
![Spring-Boot-Architecture](https://github.com/naveen-v-v/patient-management-system/blob/dev/springboot-architecture.png)

### Sample data for DB
"data.sql" file is present in src/main/resources folder. It will be executed automatically when the application is started.

### Documentation
- Swagger - springdoc-openapi is used for documentation.
- To check out the documentation, run the app --> goto http://localhost:4000/v3/api-docs

### Docker
- Container-name: patient-service-db 
  - Docker image: postgres (for DB, from Docker hub)
  - Bind ports (To access the db from outside the Docker container, that is  from IDE)
  - Set environment variables (like user, pass, db)
  - Bind mounts (Lets us save copy data to development machine, so that data does not get lost when we destroy the container)
  - Network: internal (so all the other containers on the internal network will be able to communicate with each other)
