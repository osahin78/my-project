FROM openjdk:24-jdk-slim

COPY target/my-project-0.0.1-SNAPSHOT.jar /app/myapp.jar

WORKDIR /app

CMD ["java", "-jar", "myapp.jar"]