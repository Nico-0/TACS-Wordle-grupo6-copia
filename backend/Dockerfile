FROM maven:3-openjdk-11 AS build
WORKDIR /usr/src/myapp
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY . .
RUN mvn package
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/wordle-backend-1.0.0.jar"]