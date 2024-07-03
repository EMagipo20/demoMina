FROM amazoncorretto:17-alpine-jdk
MAINTAINER ELI
COPY target/demoMina-0.0.1-SNAPSHOT.jar DemoMinaBackend.jar
ENTRYPOINT ["java", "-jar", "/DemoMinaBackend.jar"]