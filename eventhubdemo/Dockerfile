FROM openjdk:8-jdk-alpine
COPY target/*.jar eventhubdemo-0.0.1-SNAPSHOT.jar
EXPOSE  8088
ENTRYPOINT ["java","-jar", "eventhubdemo-0.0.1-SNAPSHOT.jar"]