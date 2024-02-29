FROM openjdk:17

EXPOSE:8080

COPY taget/example-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]