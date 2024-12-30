# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file from the target directory
COPY target/microservice-0.0.1-SNAPSHOT.war /app/microservice.war

# Expose port 8080 (or your preferred port)
EXPOSE 8099

# Run the application
ENTRYPOINT ["java", "-jar", "microservice.war"]
