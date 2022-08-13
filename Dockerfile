FROM adoptopenjdk/openjdk8:latest
ADD target/bmp-jeopardy-management-service-1.0.jar bmp-jeopardy-management-service.jar
RUN sh -c 'touch /bmp-jeopardy-management-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bmp-jeopardy-management-service.jar"]