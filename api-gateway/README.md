# api-gateway

This is a minimal starter for the api-gateway microservice.

How to build (locally with Maven):
```bash
cd api-gateway
mvn -q -DskipTests package
java -jar target/api-gateway-0.0.1-SNAPSHOT.jar
```

Docker build:
```bash
docker build -t api-gateway:local .
```

Notes:
- This is a skeleton. Add dependencies, configuration, and DB migration (Flyway) as needed.
- Configure application.properties / YAML for DB connectivity and service discovery.
