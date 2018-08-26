FROM java:8-jre
MAINTAINER Roland Jurd <rbjurd@gmail.com>

ADD ./target/journal-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/journal-service.jar"]

EXPOSE 6000