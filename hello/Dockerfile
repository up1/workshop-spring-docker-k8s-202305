# Mac M2
#FROM arm64v8/eclipse-temurin:17.0.7_7-jdk-focal
# Normal
FROM eclipse-temurin:17.0.7_7-jdk-focal
WORKDIR /app
COPY . .
RUN ./mvnw package
# Default command
ENTRYPOINT ["java"]
# Default parameters
CMD ["-jar", "./target/demo.jar"]