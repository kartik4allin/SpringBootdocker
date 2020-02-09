FROM openjdk:8
ADD target/SpringbootDocker-0.0.1-SNAPSHOT.jar SpringbootDocker-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SpringbootDocker-0.0.1-SNAPSHOT.jar"]