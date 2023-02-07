#FROM openjdk:11
#RUN apt-get install maven -y 
#ADD target/my-maven-docker-project.jar my-maven-docker-project.jar
#CMD ["java", "-jar","my-maven-docker-project.jar"]
#EXPOSE 8080

FROM maven:alpine as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN mvn package

FROM openjdk:8-jdk-alpine 
COPY --from=build /usr/app/target/single-module-caching-1.0-SNAPSHOT-jar-with-dependencies.jar /app/runner.jar
ENTRYPOINT java -jar /app/runner.jar
