# user-service

This is a minimal starter for the user-service microservice.

How to build (locally with Maven):
```bash
cd user-service
mvn -q -DskipTests package
java -jar target/user-service-0.0.1-SNAPSHOT.jar
```

Docker build:
```bash
docker build -t user-service:local .
```

Notes:
- This is a skeleton. Add dependencies, configuration, and DB migration (Flyway) as needed.
- Configure application.properties / YAML for DB connectivity and service discovery.
