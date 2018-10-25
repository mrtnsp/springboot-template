FROM openjdk:11.0.1-jdk-slim

ARG JAR_FILE
ADD  ${JAR_FILE} /app.jar

ENTRYPOINT ["java", "-jar","/app.jar"]
