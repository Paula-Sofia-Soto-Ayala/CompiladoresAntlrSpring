# Usa Maven y OpenJDK 21 para construir el proyecto
FROM maven:3.9.9-eclipse-temurin-21 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo pom.xml y el código fuente
COPY pom.xml .
COPY src ./src

# Compila el proyecto y empaqueta el archivo .jar
RUN mvn clean install

# Imagen base de Java para ejecutar la aplicación
FROM eclipse-temurin:21-jdk

# Copia el archivo JAR generado en la etapa de construcción
COPY --from=build /app/target/antlr-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]


# FROM openjdk:11
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java", "-jar", "/app.jar"]

