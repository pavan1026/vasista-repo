FROM adoptopenjdk/maven-openjdk11 
ADD target/my-maven-docker-project.jar /my-maven-docker-project.jar
CMD ["java", "-jar","my-maven-docker-project.jar"]
EXPOSE 8080
