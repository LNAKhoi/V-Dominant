# payment-service

This is a minimal starter for the payment-service microservice.

How to build (locally with Maven):
```bash
cd payment-service
mvn -q -DskipTests package
java -jar target/payment-service-0.0.1-SNAPSHOT.jar
```

Docker build:
```bash
docker build -t payment-service:local .
```

Notes:
- This is a skeleton. Add dependencies, configuration, and DB migration (Flyway) as needed.
- Configure application.properties / YAML for DB connectivity and service discovery.
