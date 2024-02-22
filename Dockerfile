FROM openjdk:11

MAINTAINER name kunalprajapat <virajprajapat854@gmail.com>

COPY target/Spring-Docker-App.jar  /app/user/

WORKDIR /app/user/

EXPOSE 8080

ENTRYPOINT [ "java" "-jar" "Spring-Docker-App.jar" ]

