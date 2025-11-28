# config-server

This is a minimal starter for the config-server microservice.

How to build (locally with Maven):
```bash
cd config-server
mvn -q -DskipTests package
java -jar target/config-server-0.0.1-SNAPSHOT.jar
```

Docker build:
```bash
docker build -t config-server:local .
```

Notes:
- This is a skeleton. Add dependencies, configuration, and DB migration (Flyway) as needed.
- Configure application.properties / YAML for DB connectivity and service discovery.
