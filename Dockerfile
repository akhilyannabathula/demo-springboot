FROM maven:3.8.5-openjdk-17

WORKDIR /app

# Copy all source code and pom.xml
COPY pom.xml .
COPY src ./src

# Build the JAR
RUN mvn clean package -DskipTests && cp target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the app directly
CMD ["java", "-jar", "app.jar"]
