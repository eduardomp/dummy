FROM openjdk:8
COPY . /usr/src/dummy
WORKDIR /usr/src/dummy
RUN ./mvnw clean package
EXPOSE 8080
CMD ["java", "-jar","target/dummy-0.0.1-SNAPSHOT.jar"]