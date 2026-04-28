FROM openjdk:17-jdk-slim

WORKDIR /app

# copia o jar
COPY target/meu-sistema-1.0-SNAPSHOT.jar app.jar

# executa a aplicação
CMD ["java", "-jar", "app.jar"]