FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080

#FROM openjdk:17-jdk-alpine
#COPY "./target/API-Mongo-0.0.1-SNAPSHOT.jar" "app.jar"
#EXPOSE 9000
#ENTRYPOINT [ "java", "-jar", "app.jar" ]