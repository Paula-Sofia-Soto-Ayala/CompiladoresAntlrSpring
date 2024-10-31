# Usa la imagen base de OpenJDK 21
FROM openjdk:21-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo pom.xml y el directorio src en el contenedor
COPY pom.xml .
COPY src ./src

# Instala Maven y compila el proyecto
RUN apt-get update && apt-get install -y maven
RUN mvn clean package -DskipTests

# Exponer el puerto 8080 para acceder a la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "target/antlr-0.0.1-SNAPSHOT.jar"]
