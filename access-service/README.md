# access-service

This is a minimal starter for the access-service microservice.

How to build (locally with Maven):
```bash
cd access-service
mvn -q -DskipTests package
java -jar target/access-service-0.0.1-SNAPSHOT.jar
```

Docker build:
```bash
docker build -t access-service:local .
```

Notes:
- This is a skeleton. Add dependencies, configuration, and DB migration (Flyway) as needed.
- Configure application.properties / YAML for DB connectivity and service discovery.
