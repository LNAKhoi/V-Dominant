Gym Membership Microservices Starter (Multi-Repo - packaged as folders)

This archive contains starter skeletons for separate microservice repositories. Each folder simulates a separate git repository.

Services included:
- auth-service
- user-service
- membership-service
- access-service
- payment-service
- notification-service
- analytics-service
- api-gateway
- config-server
- frontend-angular-placeholder

Next steps:
1. For each service run `mvn package` and configure application.properties (DB, service discovery).
2. Consider generating proper Spring Boot projects with `start.spring.io` and replace pom.xml with desired dependencies.
3. Create git repos for each folder and push to your Git provider.
4. Scaffold the Angular app locally with `ng new` and move it into the frontend folder.
