# Use an official OpenJDK 19 image
FROM openjdk:19-jdk-slim

# Install Maven manually
RUN apt-get update && apt-get install -y maven

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . /app

# Build the project
RUN mvn clean package

# Default command
CMD ["mvn", "clean", "install"]
