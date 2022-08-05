FROM openjdk:8

EXPOSE 9005

ADD target/auto-insurance-api-docker.jar auto-insurance-api-docker.jar

ENTRYPOINT ["java", "-jar", "/auto-insurance-api-docker.jar"]