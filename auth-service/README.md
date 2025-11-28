# auth-service

This is a minimal starter for the auth-service microservice.

How to build (locally with Maven):
```bash
cd auth-service
mvn -q -DskipTests package
java -jar target/auth-service-0.0.1-SNAPSHOT.jar
```

Docker build:
```bash
docker build -t auth-service:local .
```

Notes:
- This is a skeleton. Add dependencies, configuration, and DB migration (Flyway) as needed.
- Configure application.properties / YAML for DB connectivity and service discovery.
