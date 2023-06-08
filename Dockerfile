FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8088
ADD target/eureka_naming_server.jar eureka_naming_server.jar
ENTRYPOINT [ "java","-jar","/eureka_naming_server.jar" ]