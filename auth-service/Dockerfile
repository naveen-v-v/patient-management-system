# patient-service/Dockerfile

# Build Code
FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
# cache dependencies, so that they are not downloaded on every build if pom.xml is unchanged
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package
# Run the built code
FROM eclipse-temurin:21-jdk AS runner
WORKDIR /app
COPY --from=builder ./app/target/auth-service-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 4005
ENTRYPOINT ["java","-jar","app.jar"]