FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar app.jar; tail -f /dev/null"]