# ------------- 1 --------------
FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.2-jdk-slim
COPY --from=build /target/temp.jar temp.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","temp.jar"]