FROM openjdk:8-alpine
ADD target/docker-demoservice.jar docker-demoservice.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-demoservice.jar"]
