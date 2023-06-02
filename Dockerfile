FROM openjdk:11
COPY target/spring-boot-pharmacy-0.0.1-SNAPSHOT.jar .
EXPOSE 8191
CMD ["java", "-jar", "/spring-boot-pharmacy-0.0.1-SNAPSHOT.jar"]