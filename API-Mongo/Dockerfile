FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build/target/API-Mongo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]

#VOLUME /tmp
#COPY target/API-Mongo-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#EXPOSE 8080

#FROM openjdk:17-jdk-alpine
#COPY "./target/API-Mongo-0.0.1-SNAPSHOT.jar" "app.jar"
#EXPOSE 9000
#ENTRYPOINT [ "java", "-jar", "app.jar" ]