FROM openjdk:17-jdk-alpine
COPY "./target/API-Mongo-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 9000
ENTRYPOINT [ "java", "-jar", "app.jar" ]