From maven:3.8.5-openjdk-17 AS build

COPY . .

Run mvn clean package -DskipTests


from openjdk:17.0.1-jdk-slim
COPY --from=build /target/BookLibararySystem-0.0.1-SNAPSHOT.jar bookLibrarySystem.jar
Expose 8889

ENTRYPOINT ["java","-jar","bookLibrarySystem.jar"] 