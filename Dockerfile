# Usar una imagen base oficial de OpenJDK para asegurar compatibilidad y soporte
FROM openjdk:17-slim

# Etiquetar el contenedor con el nombre del mantenedor
LABEL maintainer="ELI"

# Copiar el archivo JAR compilado del directorio target al contenedor
COPY target/demoMina-0.0.1-SNAPSHOT.jar /DemoMinaBackend.jar

# Definir variables de entorno que podrían ser útiles para configuración o información del entorno
ENV APP_NAME="DemoMinaBackend" \
    JAVA_OPTS=""

# Punto de entrada que considera las opciones de entorno Java
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /DemoMinaBackend.jar"]

# Exponer el puerto que el servidor utiliza, si es necesario (por ejemplo, si es una aplicación web)
EXPOSE 8080
