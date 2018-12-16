FROM hub.mooc.com:8080/micro-service/openjdk:8-jre
MAINTAINER qingbao.ho@gmail.com

COPY target/course-dubbo-service-1.0-SNAPSHOT.jar /course-service.jar
ENTRYPOINT ["java", "-jar", "/course-service.jar"]